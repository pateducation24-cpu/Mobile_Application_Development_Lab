package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUser = findViewById(R.id.etUsername);
        EditText etPass = findViewById(R.id.etPassword);
        Button   btn    = findViewById(R.id.btnLogin);

        btn.setOnClickListener(v -> {
            String u = etUser.getText().toString().trim();
            String p = etPass.getText().toString().trim();

            if (u.equals("admin") && p.equals("1234")) {
                Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
                i.putExtra("username", u);
                startActivity(i);
                finish();
            } else {
                Toast.makeText(this, "Invalid username or password",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}