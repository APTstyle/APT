package com.example.hw7_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b1(View view){
        Intent intent = new Intent(MainActivity.this, p1.class);
        startActivity(intent);
    }

    public void b2(View view){
        Intent intent = new Intent(MainActivity.this, p2.class);
        startActivity(intent);
    }

    public void b3(View view){
        Intent intent = new Intent(MainActivity.this, p3.class);
        startActivity(intent);
    }
}