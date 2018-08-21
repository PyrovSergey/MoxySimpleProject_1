package com.example.pyrov.moxysimpleproject_1;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static App instance;

    private static AppComponent component;

    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        context = getApplicationContext();
        component = DaggerAppComponent.create();
    }

    public static App getInstance() {
        return instance;
    }

    public static AppComponent getComponent() {
        return component;
    }

    public Context getContext() {
        return context;
    }
}
