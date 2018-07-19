package com.example.punchh_aarti.mvvmdemo.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.example.punchh_aarti.mvvmdemo.interfaces.LoginResultCallback;
import com.example.punchh_aarti.mvvmdemo.model.User;

public class LoginViewModel extends ViewModel {

    private User user;
    private LoginResultCallback loginResultCallback;

    public LoginViewModel(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
        user = new User("", "");
    }

    public TextWatcher getEmailTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.seteMail(s.toString());
            }
        };
    }

    public TextWatcher getPasswordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setPassword(s.toString());
            }
        };
    }

    public void onLoginClicked(View view) {
        checkValidity();
    }

    private void checkValidity() {
        if (user.isInputDataValid()) {
            loginResultCallback.onSuccess("You are successfully loged in.");
        } else {
            loginResultCallback.onError("Your email or password not valid.");
        }
    }
}
