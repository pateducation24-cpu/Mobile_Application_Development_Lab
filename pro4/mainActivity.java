package com.example.toastdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etInput   = findViewById(R.id.etInput);
        Button   btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etInput.getText().toString().trim();
                if (TextUtils.isEmpty(text)) {
                    Toast.makeText(MainActivity.this,
                            "Please enter some text", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}