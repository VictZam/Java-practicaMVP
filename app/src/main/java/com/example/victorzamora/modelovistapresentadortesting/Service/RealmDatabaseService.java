package com.example.victorzamora.modelovistapresentadortesting.Service;

import com.example.victorzamora.modelovistapresentadortesting.Class.LoginPresenterImpl;
import com.example.victorzamora.modelovistapresentadortesting.Class.User;

import io.realm.Realm;

public class RealmDatabaseService {

    public RealmDatabaseService(LoginPresenterImpl loginPresenter) {
    }

    public static User findUser(String User, String Password){

        User user = Realm.getDefaultInstance().where(User.class)
                .equalTo("userName", User)
                .and()
                .equalTo("password", Password)
                .findFirst();

        return user;

    }

}
