package com.dagger2.demo;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    Person providesPerson(Context context) {
        return new Person(context);
    }

}
