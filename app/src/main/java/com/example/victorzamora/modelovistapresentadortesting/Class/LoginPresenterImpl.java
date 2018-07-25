package com.example.victorzamora.modelovistapresentadortesting.Class;

import com.example.victorzamora.modelovistapresentadortesting.Interface.LoginPresenter;
import com.example.victorzamora.modelovistapresentadortesting.Interface.LoginView;
import com.example.victorzamora.modelovistapresentadortesting.Service.AuthAPIService;
import com.example.victorzamora.modelovistapresentadortesting.Service.RealmDatabaseService;

public class LoginPresenterImpl implements LoginPresenter {
    private LoginView view;
    private RealmDatabaseService realmDatabaseService;
    private AuthAPIService authAPIService;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        this.realmDatabaseService = new RealmDatabaseService(this);
        this.authAPIService = new AuthAPIService(this);

    }

    @Override
    public void authenticate(String username, String password) {;
        User user = this.realmDatabaseService.findUser(username, password);

        if (user == null) {
            this.view.showAlertMessage("usuario no existente");
        }else {
            this.view.showAlertMessage("Bienvenido" + username);
        }
    }
}
