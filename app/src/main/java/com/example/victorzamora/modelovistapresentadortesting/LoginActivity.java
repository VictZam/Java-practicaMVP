package com.example.victorzamora.modelovistapresentadortesting;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.victorzamora.modelovistapresentadortesting.Class.LoginPresenterImpl;
import com.example.victorzamora.modelovistapresentadortesting.Interface.LoginPresenter;
import com.example.victorzamora.modelovistapresentadortesting.Interface.LoginView;

import butterknife.BindView;
import butterknife.OnClick;


public class LoginActivity extends Activity implements LoginView {

    @BindView(R.id.userEditText)
    EditText userEditText;
    @BindView(R.id.passwordEditText)
    EditText passwordEditText;
    @BindView(R.id.btnLogin)
    Button btnLogin;

    private LoginPresenter loginPresenter;

    public void onCreated(Bundle bundle) {
        this.loginPresenter = new LoginPresenterImpl(this);
    }

    @OnClick(R.id.btnLogin)
    public void loginButtonHandle() {
        this.loginPresenter.authenticate(
                userEditText.getText().toString(),
                passwordEditText.getText().toString()
        );
    }

    @Override
    public void showAlertMessage(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG)
                .show();
    }

    public Context getContext() {
        return this;
    }
}
