package com.example.dani.mvp_modell_beispiel.model;

public interface IUser {

        String getName();
        String getPasswd();
        int checkUserValidity(String name, String passwd);

}
