package com.dagger2.demo;

import android.content.Context;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getContext();
}
