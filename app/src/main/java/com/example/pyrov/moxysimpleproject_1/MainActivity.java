package com.example.pyrov.moxysimpleproject_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.pyrov.moxysimpleproject_1.presenter.MySimplePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends MvpAppCompatActivity implements MySimpleView  {
    @BindView(R.id.edit_text_input)
    EditText editTextInput;
    @BindView(R.id.edit_text_output)
    EditText editTextOutput;
    @BindView(R.id.button_result)
    Button buttonResult;

    @InjectPresenter
    MySimplePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_result)
    public void onViewClicked() {
        presenter.onClickButton();
    }

    @Override
    public void getInputData() {
        presenter.saveData(editTextInput.getText().toString());
    }

    @Override
    public void showInputData(String s) {
        editTextOutput.setText(s);
    }

    @Override
    public void clearInputField() {
        editTextInput.setText("");
    }
}
