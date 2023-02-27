package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG = getClass().getSimpleName()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause: App up and running");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume: App is resumed");
    }
}

//push