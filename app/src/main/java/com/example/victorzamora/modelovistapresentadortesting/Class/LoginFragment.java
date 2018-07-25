package com.example.victorzamora.modelovistapresentadortesting.Class;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.victorzamora.modelovistapresentadortesting.Interface.LoginPresenter;
import com.example.victorzamora.modelovistapresentadortesting.Interface.LoginView;
import com.example.victorzamora.modelovistapresentadortesting.R;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginFragment extends Fragment implements LoginView {
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.passwordEditText)
    EditText passwordEditText;
    @BindView(R.id.userEditText)
    EditText userEditText;

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
       // Toast.makeText(this.getContext(), message, Toast.LENGTH_LONG).show();
    }

}
