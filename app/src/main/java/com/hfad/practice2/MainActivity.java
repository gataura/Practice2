package com.hfad.practice2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity1OnStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity1OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity1OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity1OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity1OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity1OnDestroy");
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
