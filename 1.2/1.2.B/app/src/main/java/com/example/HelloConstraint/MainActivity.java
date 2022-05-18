package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import HelloConstraint.R;


public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button btn_count;
    private Button btn_zero;
    private Button btn_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btn_count = (Button) findViewById(R.id.button_count);
        btn_zero = (Button) findViewById(R.id.button_zero);
        btn_toast = (Button) findViewById(R.id.button_toast);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void zero(View view) {
        btn_zero.setBackgroundColor(Color.DKGRAY);
        btn_count.setBackgroundColor(Color.BLUE);
        btn_toast.setBackgroundColor(Color.BLUE);
        mShowCount.setText("0");
        mCount = 0;
    }
    public void countUp(View view) {
        mCount++;
        if(mCount % 2 == 0)
        {
            btn_count.setBackgroundColor(Color.GREEN);
            btn_zero.setBackgroundColor(Color.MAGENTA);
        }
        else
        {
            btn_count.setBackgroundColor(Color.MAGENTA);
            btn_zero.setBackgroundColor(Color.GREEN);
        }
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}