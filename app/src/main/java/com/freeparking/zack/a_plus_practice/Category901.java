package com.freeparking.zack.a_plus_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category901 extends AppCompatActivity {

    Button cableAndTransferButton;
    Button networkingButton;
    Button hardwareButton;
    Button biosButton;
    Button ramButton;
    Button printerButton;
    Button miscButton;
    Button cpuButton;
    Button storageButton;
    Button motherboardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category901);

        //Initializing all of my button objects.
        cableAndTransferButton = (Button) findViewById(R.id.cableAndTransferButton);
        networkingButton = (Button) findViewById(R.id.networkingButton);
        hardwareButton = (Button) findViewById(R.id.hardwareButton);
        biosButton = (Button) findViewById(R.id.biosButton);
        ramButton = (Button) findViewById(R.id.ramButton);
        printerButton = (Button) findViewById(R.id.printerButton);
        miscButton = (Button) findViewById(R.id.miscButton);
        cpuButton = (Button) findViewById(R.id.cpuButton);
        storageButton = (Button) findViewById(R.id.storageButton);
        motherboardButton = (Button) findViewById(R.id.motherboardButton);
    }

    public void onNetworkingButtonClick(View view){

        //When a button is clicked, I change the border to a yellow color.
        networkingButton.setBackgroundResource(R.drawable.border_button_clicked);

        //Creating an intent in regards to the PracticeMode activity.
        Intent networkingButtonIntent = new Intent(this, PracticeMode.class);

        //Sending the string 'NETWORK' to the activity.
        networkingButtonIntent.putExtra("CHOICE", "NETWORK");

        //Starting PracticeMode activity.
        startActivity(networkingButtonIntent);

    }

    //Etc...
    public void onHardwareButtonClick(View View){
        hardwareButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent hardwareButtonIntent = new Intent(this, PracticeMode.class);
        hardwareButtonIntent.putExtra("CHOICE", "GENERAL");
        startActivity(hardwareButtonIntent);
    }

    //Etc...
    public void onBiosButtonClick(View view){
        biosButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent biosButtonIntent = new Intent(this, PracticeMode.class);
        biosButtonIntent.putExtra("CHOICE","BIOS");
        startActivity(biosButtonIntent);
    }

    //Etc...
    public void onRamButtonClick(View view){
        ramButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent ramIntent = new Intent(this, PracticeMode.class);
        ramIntent.putExtra("CHOICE", "RAM");
        startActivity(ramIntent);
    }

    //Etc...
    public void onMotherboardButtonClick(View view){
        motherboardButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent motherboardIntent = new Intent(this, PracticeMode.class);
        motherboardIntent.putExtra("CHOICE", "MOTHERBOARD");
        startActivity(motherboardIntent);
    }

    //Etc...
    public void onPrinterButtonClick(View view){
        printerButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent printerIntent = new Intent(this, PracticeMode.class);
        printerIntent.putExtra("CHOICE", "PRINTER");
        startActivity(printerIntent);
    }

    //Etc...
    public void onCableAndTransferButtonClick(View view){
        cableAndTransferButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent cableAndTransferIntent = new Intent(this, PracticeMode.class);
        cableAndTransferIntent.putExtra("CHOICE", "CABLEANDTRANSFER");
        startActivity(cableAndTransferIntent);
    }

    //Etc...
    public void onCpuButtonClick(View view){
        cpuButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent cpuIntent = new Intent(this, PracticeMode.class);
        cpuIntent.putExtra("CHOICE", "CPU");
        startActivity(cpuIntent);
    }

    //Etc...
    public void onMiscButtonClick(View view){
        miscButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent miscIntent = new Intent(this, PracticeMode.class);
        miscIntent.putExtra("CHOICE", "MISC");
        startActivity(miscIntent);
    }

    //Etc...
    public void onStorageButtonClick(View view){
        storageButton.setBackgroundResource(R.drawable.border_button_clicked);
        Intent storageIntent = new Intent(this, PracticeMode.class);
        storageIntent.putExtra("CHOICE", "STORAGE");
        startActivity(storageIntent);
    }

    //Reverting the button's borders to their original states when the activity is no longer visible.
    //Otherwise they would continue to appear "clicked".
    public void revertButtonBackgrounds(){
        storageButton.setBackgroundResource(R.drawable.button_border);
        networkingButton.setBackgroundResource(R.drawable.button_border);
        miscButton.setBackgroundResource(R.drawable.button_border);
        cpuButton.setBackgroundResource(R.drawable.button_border);
        ramButton.setBackgroundResource(R.drawable.button_border);
        printerButton.setBackgroundResource(R.drawable.button_border);
        motherboardButton.setBackgroundResource(R.drawable.button_border);
        biosButton.setBackgroundResource(R.drawable.button_border);
        cableAndTransferButton.setBackgroundResource(R.drawable.button_border);
        hardwareButton.setBackgroundResource(R.drawable.button_border);
    }

    //onStop is called whenever the activity is no longer visible to the user.
    @Override
    protected void onStop() {
        super.onStop();
        revertButtonBackgrounds();
    }
}
