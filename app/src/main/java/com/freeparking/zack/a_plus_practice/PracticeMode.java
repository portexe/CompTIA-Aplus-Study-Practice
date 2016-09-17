package com.freeparking.zack.a_plus_practice;

import android.animation.Animator;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeMode extends AppCompatActivity {

    //Views and buttons.
    ImageButton nextButton;
    ImageButton previousButton;
    TextView questionTextView;
    TextView answerTextView;
    TextView shuffleTextView;
    Button struggleButton;
    Button notStruggleButton;
    SQLiteDatabase strugglingDB = null;
    List<Question> questionListGlobal;
    List<Question> listOfAllStrugglingQuestions;
    RelativeLayout shuffleRelativeLayout;
    RelativeLayout topRelativeLayout;
    RelativeLayout bottomRelativeLayout;
    int indexTheUserIsOn;
    int testCounter;

    //Used only to differentiate between normal practice mode and
    //struggle practice mode.
    boolean strugglePractice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_mode);

        testCounter = 0;

        //Initializing buttons and views.
        questionTextView = (TextView) findViewById(R.id.questionTextView);
        answerTextView = (TextView) findViewById(R.id.answerTextView);
        shuffleTextView = (TextView) findViewById(R.id.shufflingTextView);
        nextButton = (ImageButton) findViewById(R.id.nextButtonAction);
        previousButton = (ImageButton) findViewById(R.id.backButtonAction);
        struggleButton = (Button) findViewById(R.id.strugglingButton);
        notStruggleButton = (Button) findViewById(R.id.notStrugglingButton);
        shuffleRelativeLayout = (RelativeLayout) findViewById(R.id.shufflingRelativeLayout);
        topRelativeLayout = (RelativeLayout) findViewById(R.id.topRelativeLayout);
        bottomRelativeLayout = (RelativeLayout) findViewById(R.id.bottomRelativeLayout);
        answerTextView.setText("");

        //Begin by initializing the database.
        createDatabase();

        listOfAllStrugglingQuestions();

        indexTheUserIsOn = 0;

        //Grab the intent extras from the previous activity.
        Intent choiceIntent = getIntent();
        String choice = choiceIntent.getStringExtra("CHOICE");

        //Determines if the user is on struggle practice mode, or normal practice mode.
        if(choice.equals("STRUGGLING")){
            strugglePractice = true;
        }else{
            strugglePractice = false;
        }

        //Get the proper questions based on the intent extra.
        getProperQuestions(choice);

        displayNextQuestion(0);
    }

    @Override
    protected void onStart() {
        super.onStart();
        createDatabase();
    }

    //Initializes the database.
    public void createDatabase(){
        try {
            strugglingDB = this.openOrCreateDatabase("Struggling", MODE_PRIVATE, null);
            strugglingDB.execSQL("CREATE TABLE IF NOT EXISTS questions " +
                    "(id integer primary key, questionText text, answerText text, category text);");
        }catch(Exception e){
        }
    }

    //Based upon what the user clicked in the last activity.
    public void getProperQuestions(String choice) {

        Flashcards fc = new Flashcards();

        switch (choice) {
            case "GENERAL901STUDY":
                initializeQuestionObjects(fc.getGeneralStudy901Cards());
                break;
            case "GENERAL902STUDY":
                initializeQuestionObjects(fc.getGeneralStudy902Cards());
                break;
            case "BIOS":
                initializeQuestionObjects(fc.getBiosFlashcards());
                break;
            case "MOTHERBOARD":
                initializeQuestionObjects(fc.getMotherboardFlashcards());
                break;
            case "RAM":
                initializeQuestionObjects(fc.getRamFlashcards());
                break;
            case "STORAGE":
                initializeQuestionObjects(fc.getStorageFlashcards());
                break;
            case "MISC":
                initializeQuestionObjects(fc.getMiscFlashcards());
                break;
            case "PRINTER":
                initializeQuestionObjects(fc.getPrinterFlashcards());
                break;
            case "NETWORK":
                initializeQuestionObjects(fc.getNetworkingFlashcards());
                break;
            case "CPU":
                initializeQuestionObjects(fc.getCpuFlashcards());
                break;
            case "CABLEANDTRANSFER":
                initializeQuestionObjects(fc.getCableAndTransferFlashcards());
                break;
            case "COMMANDLINETOOLS":
                initializeQuestionObjects(fc.getCommandLineToolsFlashcards());
                break;
            case "SECURITY":
                initializeQuestionObjects(fc.getSecurityFlashcards());
                break;
            case "SOFTWARETROUBLESHOOTING":
                initializeQuestionObjects(fc.getSoftwareTroubleshootingFlashcards());
                break;
            case "WINDOWSFEATURES":
                initializeQuestionObjects(fc.getWindowsFeaturesFlashcards());
                break;
            case "STRUGGLING":
                questionListGlobal = listOfAllStrugglingQuestions;
                break;
        }
    }

    public void initializeQuestionObjects(List<Question> questionList){
        for(Question q : questionList){
            if(isUserStruggling(q)){
                q.setStruggling(true);
            }
        }
        Collections.shuffle(questionList);
        questionListGlobal = questionList;
        Log.d("Question", questionListGlobal.get(0).getQuestionText());
        Log.d("Answer", questionListGlobal.get(0).getAnswerText());
    }

    public boolean isUserStruggling(Question questionToCheck){
        for(Question q : listOfAllStrugglingQuestions){
            if (q.getQuestionText().equals(questionToCheck.getQuestionText())){
                Log.d("Yes Struggle", questionToCheck.getQuestionText());
                return true;
            }
        }
        testCounter++;
        Log.d("Counter", testCounter + "");
        return false;
    }

    public void listOfAllStrugglingQuestions(){

        List<Question> questionsUserIsStrugglingWith = new ArrayList<>();

        Cursor cursor = strugglingDB.rawQuery("SELECT * FROM questions", null);
        int questionTextColumn = cursor.getColumnIndex("questionText");
        int answerTextColumn = cursor.getColumnIndex("answerText");
        int categoryColumn = cursor.getColumnIndex("category");
        cursor.moveToFirst();
        Log.d("Made it", "True");

        //If there are results from the query.
        if (cursor != null && (cursor.getCount() > 0)) {
            do {
                String decodedQuestion = decodeStringFromSql(cursor.getString(questionTextColumn));
                String decodedAnswer = decodeStringFromSql(cursor.getString(answerTextColumn));

                questionsUserIsStrugglingWith.add(fromStringsToQuestionObject(decodedQuestion, decodedAnswer,
                        cursor.getString(categoryColumn), true));

            } while (cursor.moveToNext());

            cursor.close();
        }
        listOfAllStrugglingQuestions = questionsUserIsStrugglingWith;
//        return questionsUserIsStrugglingWith;
    }

    public Question fromStringsToQuestionObject(String questionText, String answerText, String category, boolean isStruggling){
        Question qToReturn = new Question(
                questionText,
                answerText,
                category,
                isStruggling
        );
        return qToReturn;
    }

    //Used for avoiding errors related to apostrophes inside of strings being
    //executed by SQL statements.
    public String encodeStringForSql(String stringToEncode){
        String stringToReturn = stringToEncode.replace("'", "*");
        return stringToReturn;
    }
    public String decodeStringFromSql(String stringToDecode){
        String stringToReturn = stringToDecode.replace("*", "'");
        return stringToReturn;
    }

    public void displayNextQuestion(int backOrForward){
        indexTheUserIsOn += backOrForward;
        globalListAndIndexManager();

        strugglingButtonManager();

        String questionText = questionListGlobal.get(indexTheUserIsOn).getQuestionText();
        questionTextView.setText(questionText);
        questionTextView.startAnimation(AnimationUtils.loadAnimation(PracticeMode.this, android.R.anim.slide_in_left));

        if(backOrForward == -1){
            String answerText = questionListGlobal.get(indexTheUserIsOn).getAnswerText();
            answerTextView.setText(answerText);
            answerTextView.startAnimation(AnimationUtils.loadAnimation(PracticeMode.this, android.R.anim.slide_in_left));
        }else{
            answerTextView.setText("");

            //Test get time.
            Log.d("Average", questionListGlobal.get(indexTheUserIsOn).getAverageTimeSpentOnQuestion() + "");


            //Set time
            questionListGlobal.get(indexTheUserIsOn).setStartTimeViewing(System.currentTimeMillis());
        }
    }

    public void displayAnswer(){

        //Set time.
        questionListGlobal.get(indexTheUserIsOn).setEndTimeViewing(System.currentTimeMillis());

        Log.d("start", questionListGlobal.get(indexTheUserIsOn).getStartTimeViewing() + "");
        Log.d("end", questionListGlobal.get(indexTheUserIsOn).getEndTimeViewing() + "");
        Log.d("Total", (questionListGlobal.get(indexTheUserIsOn).getEndTimeViewing()) - (questionListGlobal.get(indexTheUserIsOn).getStartTimeViewing()) + "");

        String answerText = questionListGlobal.get(indexTheUserIsOn).getAnswerText();
        answerTextView.setText(answerText);
        answerTextView.startAnimation(AnimationUtils.loadAnimation(PracticeMode.this, android.R.anim.slide_in_left));
    }

    public void strugglingButtonManager(){
        if(!questionListGlobal.get(indexTheUserIsOn).isStruggling()){
            notStruggleButton.setVisibility(View.GONE);
            struggleButton.setVisibility(View.VISIBLE);
        }else{
            notStruggleButton.setVisibility(View.VISIBLE);
            struggleButton.setVisibility(View.GONE);
        }
    }

    public void onNextQuestionButtonClick(View view){
        String answerText = answerTextView.getText().toString();
        if(answerText.equals("")){
            displayAnswer();
        }else{
            displayNextQuestion(1);
        }
    }

    public void onBackQuestionButtonClick(View view){
        if(indexTheUserIsOn > 0) {
            displayNextQuestion(-1);
        }
    }

    public void onStrugglingButtonClick(View view){

        Question questionUserIsOn = questionListGlobal.get(indexTheUserIsOn);

        questionUserIsOn.setStruggling(true);
        strugglingButtonManager();
        addQuestionToDB(questionUserIsOn);
    }

    public void onNotStrugglingButtonClick(View view){

        Question questionUserIsOn = questionListGlobal.get(indexTheUserIsOn);
        questionUserIsOn.setStruggling(false);
        strugglingButtonManager();
        removeQuestionFromDB(questionUserIsOn);

        //If the user is in struggle practice mode and there are no longer
        //any questions in the struggle database, return the user to
        //the main activity.
        if(!checkIfDBIsValid() && strugglePractice){
            Intent noMoreQuestionsIntent = new Intent(this, MainActivity.class);
            startActivity(noMoreQuestionsIntent);
            Toast.makeText(PracticeMode.this, "Not struggling with any more questions.", Toast.LENGTH_SHORT).show();
        }
    }

    //Checks to see if there are any items stored in the database.
    public boolean checkIfDBIsValid(){
        Cursor cursor = strugglingDB.rawQuery("SELECT * FROM questions", null);
        //If there are 0 results from the query.
        if(cursor.getCount() < 1){
            cursor.close();
            return false;
        }else{
            cursor.close();
            return true;
        }
    }

    public void globalListAndIndexManager(){

        int listSize = questionListGlobal.size();
        if(indexTheUserIsOn == listSize && !strugglePractice) {
            shuffleFadeIn();
            Collections.shuffle(questionListGlobal);
            indexTheUserIsOn = 0;

        //If the user has went through all of the flashcards, and is
        //in struggle practice mode, we recreate the list of questions to
        //exclude the questions the user is no longer struggling with.
        }else if(indexTheUserIsOn == listSize && strugglePractice){
            listOfAllStrugglingQuestions();
            getProperQuestions("STRUGGLING");
            shuffleFadeIn();
            Collections.shuffle(questionListGlobal);
            indexTheUserIsOn = 0;
        }
    }

    public void addQuestionToDB(Question q){
        String encodedQuestion = encodeStringForSql(q.getQuestionText());
        String encodedAnswer = encodeStringForSql(q.getAnswerText());

        //Executing SQL with the encoded variables.
        strugglingDB.execSQL("INSERT INTO questions (questionText, answerText, category) " +
                "VALUES ('" + encodedQuestion + "', '" + encodedAnswer +
                "', '" + q.getCategory() + "');");
    }
    public void removeQuestionFromDB(Question q){
        String encodedQuestion = encodeStringForSql(q.getQuestionText());

        //Delete the item that matches.
        strugglingDB.execSQL("DELETE FROM questions WHERE questionText = '" +
                encodedQuestion + "';");
    }

    public void shuffleFadeIn(){
        shuffleRelativeLayout.setAlpha(0f);
        shuffleRelativeLayout.setVisibility(View.VISIBLE);
        shuffleRelativeLayout.animate().alpha(1f).setDuration(1000).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                topRelativeLayout.setVisibility(View.GONE);
                bottomRelativeLayout.setVisibility(View.GONE);
                shuffleRelativeLayout.setVisibility(View.VISIBLE);
                shuffleTextView.startAnimation(AnimationUtils.loadAnimation(PracticeMode.this, android.R.anim.slide_in_left));
            }
            @Override
            public void onAnimationEnd(Animator animation) {
                shuffleFadeOut();
            }
            @Override
            public void onAnimationCancel(Animator animation) {

            }
            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
    public void shuffleFadeOut(){
        shuffleRelativeLayout.animate().alpha(0f).setDuration(1000).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                topRelativeLayout.setVisibility(View.VISIBLE);
                bottomRelativeLayout.setVisibility(View.VISIBLE);
                nextButton.setClickable(false);
                previousButton.setClickable(false);
                shuffleTextView.startAnimation(AnimationUtils.loadAnimation(PracticeMode.this, android.R.anim.slide_out_right));
                shuffleTextView.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onAnimationEnd(Animator animation) {

                shuffleRelativeLayout.setVisibility(View.GONE);
                shuffleTextView.setVisibility(View.VISIBLE);
                nextButton.setClickable(true);
                previousButton.setClickable(true);
            }
            @Override
            public void onAnimationCancel(Animator animation) {

            }
            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }


    //Called when the activity is no longer visible to the user.
    @Override
    protected void onStop() {
        super.onStop();
        strugglingDB.close();
    }
}
