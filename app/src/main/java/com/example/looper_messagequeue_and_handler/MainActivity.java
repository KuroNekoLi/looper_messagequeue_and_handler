package com.example.looper_messagequeue_and_handler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private ExampleLopperThread lopperThread = new ExampleLopperThread();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startThread(View view) {
        lopperThread.start();
    }

    public void stopThread(View view) {
    }

    public void taskA(View view) {
    }

    public void taskB(View view) {
    }
}