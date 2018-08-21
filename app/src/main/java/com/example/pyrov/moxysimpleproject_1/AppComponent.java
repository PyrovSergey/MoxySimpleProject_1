package com.example.pyrov.moxysimpleproject_1;

import com.example.pyrov.moxysimpleproject_1.model.MyData;
import com.example.pyrov.moxysimpleproject_1.model.MyDataModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MyDataModule.class})
public interface AppComponent {

    MyData getMyData();
}
