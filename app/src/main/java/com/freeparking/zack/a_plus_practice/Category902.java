package com.freeparking.zack.a_plus_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category902 extends AppCompatActivity {

    Button general902StudyButton;
    Button windowsFeaturesButton;
    Button commandLineToolsButton;
    Button securityButton;
    Button softwareTroubleshootingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category902);

        general902StudyButton = (Button) findViewById(R.id.general902StudyButton);
        commandLineToolsButton = (Button) findViewById(R.id.commandLineToolsButton);
        securityButton = (Button) findViewById(R.id.securityButton);
        softwareTroubleshootingButton = (Button) findViewById(R.id.softwareTroubleshootingButton);
        windowsFeaturesButton = (Button) findViewById(R.id.windowsFeaturesButton);
    }

    public void onGeneral902StudyButtonClick(View View){

        Metrics.pageUserIsOn = Metrics.pageUserIsOn.concat("General");

        general902StudyButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent general902StudyButtonIntent = new Intent(this, PracticeMode.class);
        general902StudyButtonIntent.putExtra("CHOICE", "GENERAL902STUDY");
        startActivity(general902StudyButtonIntent);
    }

    public void onWindowsFeaturesButtonClick(View view){

        Metrics.pageUserIsOn = Metrics.pageUserIsOn.concat("WindowsFeatures");

        //When a button is clicked, I change the border to a yellow color.
        windowsFeaturesButton.setBackgroundResource(R.drawable.border_button_clicked);

        //Creating an intent in regards to the PracticeMode activity.
        Intent windowsFeaturesIntent = new Intent(this, PracticeMode.class);

        //Sending the string 'NETWORK' to the activity.
        windowsFeaturesIntent.putExtra("CHOICE", "WINDOWSFEATURES");

        //Starting PracticeMode activity.
        startActivity(windowsFeaturesIntent);
    }

    //Etc...
    public void onCommandLineToolsButtonClick(View view){

        Metrics.pageUserIsOn = Metrics.pageUserIsOn.concat("CommandLineTools");

        commandLineToolsButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent commandLineToolsIntent = new Intent(this, PracticeMode.class);
        commandLineToolsIntent.putExtra("CHOICE", "COMMANDLINETOOLS");
        startActivity(commandLineToolsIntent);
    }

    public void onSecurityButtonClick(View view){

        Metrics.pageUserIsOn = Metrics.pageUserIsOn.concat("Security");

        securityButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent securityIntent = new Intent(this, PracticeMode.class);
        securityIntent.putExtra("CHOICE", "SECURITY");
        startActivity(securityIntent);
    }

    public void onSoftwareTroubleshootingButtonClick(View view){

        Metrics.pageUserIsOn = Metrics.pageUserIsOn.concat("Software");

        softwareTroubleshootingButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent softwareTroubleshootingIntent = new Intent(this, PracticeMode.class);
        softwareTroubleshootingIntent.putExtra("CHOICE", "SOFTWARETROUBLESHOOTING");
        startActivity(softwareTroubleshootingIntent);
    }

    //Reverting the button's borders to their original states when the activity is no longer visible.
    //Otherwise they would continue to appear "clicked".
    public void revertButtonBackgrounds(){
        general902StudyButton.setBackgroundResource(R.drawable.button_border);
        commandLineToolsButton.setBackgroundResource(R.drawable.button_border);
        securityButton.setBackgroundResource(R.drawable.button_border);
        softwareTroubleshootingButton.setBackgroundResource(R.drawable.button_border);
        windowsFeaturesButton.setBackgroundResource(R.drawable.button_border);
    }

    //onStop is called whenever the activity is no longer visible to the user.
    @Override
    protected void onStop() {
        super.onStop();
        revertButtonBackgrounds();
    }
}
