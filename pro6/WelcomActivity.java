package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String user = getIntent().getStringExtra("username");
        TextView tv = findViewById(R.id.tvWelcome);
        tv.setText("Welcome, " + user + "!");
    }
}