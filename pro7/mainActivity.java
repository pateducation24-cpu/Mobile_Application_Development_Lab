package com.example.loginverifyapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Hard-coded credentials for verification
    private static final String VALID_USER = "admin";
    private static final String VALID_PASS = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnLogin     = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String user = etUsername.getText().toString().trim();
            String pass = etPassword.getText().toString().trim();

            // Validation: empty check
            if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)) {
                Toast.makeText(MainActivity.this,
                        "Please enter both username and password",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            // Verification
            if (user.equals(VALID_USER) && pass.equals(VALID_PASS)) {
                // Successful → go to DisplayActivity, passing BOTH values
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("username", user);
                intent.putExtra("password", pass);
                startActivity(intent);
            } else {
                // Failed → Toast alert
                Toast.makeText(MainActivity.this,
                        "Verification failed: invalid credentials",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}