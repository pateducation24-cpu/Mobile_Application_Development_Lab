package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tvHello);
        tv.setText("Hello World");
        tv.setTextColor(Color.WHITE);                 // text color
        tv.setBackgroundColor(Color.parseColor("#3F51B5")); // background color
    }
}