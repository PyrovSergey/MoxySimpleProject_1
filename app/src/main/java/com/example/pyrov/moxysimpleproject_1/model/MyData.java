package com.example.pyrov.moxysimpleproject_1.model;

public class MyData implements Contract.DataContract{
    private String data;

    @Override
    public void saveData(String s) {
        this.data = s;
    }

    @Override
    public String getSaveData() {
        return data;
    }
}
