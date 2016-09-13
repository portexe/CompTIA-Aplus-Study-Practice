package com.freeparking.zack.a_plus_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category902 extends AppCompatActivity {

    Button windowsFeaturesButton;
    Button commandLineToolsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category902);

        commandLineToolsButton = (Button) findViewById(R.id.commandLineToolsButton);
        windowsFeaturesButton = (Button) findViewById(R.id.windowsFeaturesButton);
    }

    public void onWindowsFeaturesButtonClick(View view){

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
        commandLineToolsButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent commandLineToolsIntent = new Intent(this, PracticeMode.class);
        commandLineToolsIntent.putExtra("CHOICE", "COMMANDLINETOOLS");
        startActivity(commandLineToolsIntent);
    }

    //Reverting the button's borders to their original states when the activity is no longer visible.
    //Otherwise they would continue to appear "clicked".
    public void revertButtonBackgrounds(){
        commandLineToolsButton.setBackgroundResource(R.drawable.button_border);
        windowsFeaturesButton.setBackgroundResource(R.drawable.button_border);
    }

    //onStop is called whenever the activity is no longer visible to the user.
    @Override
    protected void onStop() {
        super.onStop();
        revertButtonBackgrounds();
    }
}
