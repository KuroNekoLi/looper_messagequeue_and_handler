package com.example.looper_messagequeue_and_handler;

import android.os.SystemClock;
import android.util.Log;

public class ExampleLopperThread extends Thread{
    private static final String TAG = "ExampleLopperThread";
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Log.d(TAG, "run: "+i);
            SystemClock.sleep(1000);
        }
    }
}
