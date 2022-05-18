package com.example.hw61;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String textmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showtext(View view) {
        // Is the button now checked?
        CheckBox c1= findViewById(R.id.checkBox);
        CheckBox c2= findViewById(R.id.checkBox2);
        CheckBox c3= findViewById(R.id.checkBox3);
        CheckBox c4= findViewById(R.id.checkBox4);
        CheckBox c5= findViewById(R.id.checkBox5);
        // Check which radio button was clicked.
        textmessage = "";
        if(c1.isChecked())
            textmessage+="*"+ c1.getText().toString();
        if(c2.isChecked())
            textmessage+="*"+ c2.getText().toString();
        if(c3.isChecked())
            textmessage+="*"+ c3.getText().toString();
        if(c4.isChecked())
            textmessage+="*"+ c4.getText().toString();
        if(c5.isChecked())
            textmessage+="*"+ c5.getText().toString();
        displayToast(textmessage);
    }
}