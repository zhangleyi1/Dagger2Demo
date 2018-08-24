package com.dagger2.demo;

import android.content.Context;
import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    private String TAG = "MainModule";
    private Context context;
    public MainModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context providesContext() {
        return context;
    }

    @Provides
    public Person providesPersion() {
        Log.d(TAG, "zly --> providesPersion begin.");
        return new Person(context);
    }
}
