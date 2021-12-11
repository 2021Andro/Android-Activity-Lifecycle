package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Control in --> onCreate() Index --> 1");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Control in --> onStart() Index --> 2");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Control in --> onResume() Index --> 3");

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Control in --> onRestart() Index --> 4");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Control in --> onPause() Index --> 5");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Control in --> onStop() Index --> 6");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Control in --> onDestroy() Index --> 7");

    }
}