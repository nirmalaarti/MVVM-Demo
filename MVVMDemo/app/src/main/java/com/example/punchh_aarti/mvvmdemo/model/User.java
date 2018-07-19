package com.example.punchh_aarti.mvvmdemo.model;

import android.databinding.BaseObservable;
import android.text.TextUtils;
import android.util.Patterns;

public class User extends BaseObservable{

    private String eMail;
    private String password;

    public User(String eMail, String password) {
        this.eMail = eMail;
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(geteMail())
                && Patterns.EMAIL_ADDRESS.matcher(geteMail()).matches()
                && !TextUtils.isEmpty(getPassword());
    }
}
