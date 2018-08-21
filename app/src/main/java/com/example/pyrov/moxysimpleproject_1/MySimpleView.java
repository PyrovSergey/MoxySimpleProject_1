package com.example.pyrov.moxysimpleproject_1;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

@StateStrategyType(AddToEndSingleStrategy.class)
public interface MySimpleView extends MvpView {
    void getInputData();

    void showInputData(String s);

    void clearInputField();
}
