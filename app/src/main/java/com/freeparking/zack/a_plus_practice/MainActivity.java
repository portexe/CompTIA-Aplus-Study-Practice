package com.freeparking.zack.a_plus_practice;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase strugglingDB = null;

    Button button901;
    Button button902;
    Button strugglingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the buttons.
        button901 = (Button) findViewById(R.id.button901);
        button902 = (Button) findViewById(R.id.button902);
        strugglingButton = (Button) findViewById(R.id.strugglingButton);

        //Begin by initializing the database.
        createDatabase();
    }


    //Initialize the database.
    public void createDatabase(){
        try {
            //Opens the database, or creates a new one if it doesn't already exist on the user's storage.
            strugglingDB = this.openOrCreateDatabase("Struggling", MODE_PRIVATE, null);

            //Creates the questions table if it doesn't already exist.
            strugglingDB.execSQL("CREATE TABLE IF NOT EXISTS questions " +
                    "(id integer primary key, questionText text, answerText text, category text);");

        }catch(Exception e){
        }
    }

    //Checks to see if there are any items stored in the database.
    public boolean checkIfDBIsValid(){

        //Creating a cursor object and grabbing all items from the questions table.
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

    //When the 901 button is clicked.
    public void onButton901Click(View view){

        //When a button is clicked, I change the border to a yellow color.
        button901.setBackgroundResource(R.drawable.border_button_clicked);

        //Create an intent in regards to the Category901 activity.
        Intent button901Intent = new Intent(this, Category901.class);
        startActivity(button901Intent);
    }

    //Etc...
    public void onButton902Click(View view){
        button902.setBackgroundResource(R.drawable.border_button_clicked);
        Intent button902Intent = new Intent(this, Category902.class);
        startActivity(button902Intent);
    }


    public void onStrugglingButtonClick(View view){
        //Check to see if there are any items stored in the database.
        if(checkIfDBIsValid()){

            //If there are..
            //Create an intent in regards to the PracticeMode activity, start the activity, and
            //send the String 'STRUGGLING' to the activity.
            strugglingButton.setBackgroundResource(R.drawable.border_button_clicked);
            Intent strugglingIntent = new Intent(this, PracticeMode.class);
            strugglingIntent.putExtra("CHOICE", "STRUGGLING");
            startActivity(strugglingIntent);
        }else{

            //Otherwise inform the user that they have yet to add any questions to the struggling database.
            Toast.makeText(MainActivity.this, "You haven't marked any questions yet.", Toast.LENGTH_LONG).show();
        }
    }

    //Reverting the button's borders to their original states when the activity is no longer visible.
    //Otherwise they would continue to appear "clicked".
    public void revertButtonBackgrounds(){
        button901.setBackgroundResource(R.drawable.button_border);
        button902.setBackgroundResource(R.drawable.button_border);
        strugglingButton.setBackgroundResource(R.drawable.button_border);
    }

    //onStop is called whenever the activity is no longer visible to the user.
    @Override
    protected void onStop() {
        super.onStop();
        revertButtonBackgrounds();
    }
}
