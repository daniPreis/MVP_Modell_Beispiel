package com.example.dani.mvp_modell_beispiel.view;

public interface ILoginView {

    //Dient zum updaten der Infos des Presenter im View Package
    public void onClearText();
    public void onLoginResult(Boolean result, int code);
    public void onSetProgressBarVisibility(int visibility);
}
