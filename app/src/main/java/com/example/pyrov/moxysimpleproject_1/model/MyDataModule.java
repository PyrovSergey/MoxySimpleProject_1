package com.example.pyrov.moxysimpleproject_1.model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyDataModule {
    @Singleton
    @Provides
    MyData provideMyData() {
        return new MyData();
    }
}
