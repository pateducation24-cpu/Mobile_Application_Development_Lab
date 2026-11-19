package com.example.labwork9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.etNum1);
        et2 = findViewById(R.id.etNum2);
        tvResult = findViewById(R.id.tvResult);

        findViewById(R.id.btnAdd).setOnClickListener(v -> calc('+'));
        findViewById(R.id.btnSub).setOnClickListener(v -> calc('-'));
        findViewById(R.id.btnMul).setOnClickListener(v -> calc('*'));
        findViewById(R.id.btnDiv).setOnClickListener(v -> calc('/'));
        findViewById(R.id.btnMod).setOnClickListener(v -> calc('%'));

        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(v -> {
            et1.setText("");
            et2.setText("");
            tvResult.setText("Result: ");
        });
    }

    private void calc(char op) {
        String s1 = et1.getText().toString().trim();
        String s2 = et2.getText().toString().trim();
        if (s1.isEmpty() || s2.isEmpty()) {
            Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double r;

        switch (op) {
            case '+': r = a + b; break;
            case '-': r = a - b; break;
            case '*': r = a * b; break;
            case '/':
                if (b == 0) { Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show(); return; }
                r = a / b; break;
            case '%':
                if (b == 0) { Toast.makeText(this, "Cannot mod by zero", Toast.LENGTH_SHORT).show(); return; }
                r = a % b; break;
            default:  r = 0;
        }
        tvResult.setText("Result: " + r);
    }
}