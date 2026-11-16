package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifeCycleDemo";
    private TextView tvLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvLog = findViewById(R.id.tvLog);
        logAndShow("onCreate() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logAndShow("onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logAndShow("onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logAndShow("onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logAndShow("onStop() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logAndShow("onRestart() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logAndShow("onDestroy() called");
    }

    private void logAndShow(String msg) {
        Log.d(TAG, msg);
        tvLog.append(msg + "\n");
    }
}