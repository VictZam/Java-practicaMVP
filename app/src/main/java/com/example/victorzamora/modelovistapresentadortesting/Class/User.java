package com.example.victorzamora.modelovistapresentadortesting.Class;

import io.realm.RealmObject;

public class User extends RealmObject {

    String userName = "MVP";
    String password = "123456";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
