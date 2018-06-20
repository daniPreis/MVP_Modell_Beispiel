package com.example.dani.mvp_modell_beispiel.presenter;

public interface ILoginPresenter {



    //Für Kommunikation mit der LoginActivity im View. Diese Klasse wird vom LoginPresenterCompl implementiert
    void clear();
    void doLogin(String name, String passwd);
    void setProgressBarVisiblity(int visiblity);


}
