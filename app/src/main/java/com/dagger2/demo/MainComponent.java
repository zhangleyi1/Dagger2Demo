package com.dagger2.demo;

import dagger.Component;

@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
