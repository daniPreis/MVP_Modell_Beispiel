package com.example.dani.mvp_modell_beispiel.presenter;

import android.os.Handler;
import android.os.Looper;

import com.example.dani.mvp_modell_beispiel.model.IUser;
import com.example.dani.mvp_modell_beispiel.model.UserModel;
import com.example.dani.mvp_modell_beispiel.view.ILoginView;

public class LoginPresenterCompl implements ILoginPresenter {

    //In dieser Klasse werden die Login Funktionalitäten verwaltet und an die Activity zurückgegeben

    ILoginView iLoginView;
    IUser user;
    Handler handler;
    public LoginPresenterCompl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        initUser();
        handler = new Handler(Looper.getMainLooper());
    }
    @Override
    public void clear() {
        iLoginView.onClearText();
    }
    @Override
    public void doLogin(String name, String passwd) {
        Boolean isLoginSuccess = true;
        final int code = user.checkUserValidity(name,passwd);
        if (code!=0) isLoginSuccess = false;
        final Boolean result = isLoginSuccess;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(result, code);
            }
        }, 5000);
    }
    @Override
    public void setProgressBarVisiblity(int visiblity){
        iLoginView.onSetProgressBarVisibility(visiblity);
    }
    private void initUser(){
        user = new UserModel("mvp","mvp");
    }
    }


