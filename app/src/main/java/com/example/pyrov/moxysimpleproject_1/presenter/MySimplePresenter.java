package com.example.pyrov.moxysimpleproject_1.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.pyrov.moxysimpleproject_1.app.App;
import com.example.pyrov.moxysimpleproject_1.view.MySimpleView;
import com.example.pyrov.moxysimpleproject_1.model.Contract;

@InjectViewState
public class MySimplePresenter extends MvpPresenter<MySimpleView> {
    private Contract.DataContract data;

    public MySimplePresenter() {
        this.data = App.getComponent().getMyData();
    }

    public void onClickButton() {
        getViewState().getInputData();
    }

    public void saveData(String s) {
        data.saveData(s);
        getViewState().showInputData(data.getSaveData());
        getViewState().clearInputField();
    }
}
