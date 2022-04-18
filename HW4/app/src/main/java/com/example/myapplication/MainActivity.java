package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int N1 = 0;
    private TextView PrintN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrintN = (TextView) findViewById(R.id.show_count);

        if (savedInstanceState != null) {
            N1 = savedInstanceState.getInt("count");
            if (PrintN != null)
                PrintN.setText(Integer.toString(N1));
        }

    }
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("count", N1);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        N1++;
        if (PrintN != null)
            PrintN.setText(Integer.toString(N1));
    }
}