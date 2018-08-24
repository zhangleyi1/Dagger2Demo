package com.dagger2.demo;

import android.content.Context;
import android.util.Log;

public class Person {
    private String TAG = "Person";
    private Context context;

    public Person(Context context) {
        System.out.println("zly --> Person constructor.");
    }

    public void getPerson() {
        Log.d(TAG, "zly --> getPerson.");
    }
}
