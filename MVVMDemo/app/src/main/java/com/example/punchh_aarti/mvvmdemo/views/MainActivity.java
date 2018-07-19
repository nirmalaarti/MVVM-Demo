package com.example.punchh_aarti.mvvmdemo.views;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.punchh_aarti.mvvmdemo.R;
import com.example.punchh_aarti.mvvmdemo.databinding.ActivityMainBinding;
import com.example.punchh_aarti.mvvmdemo.interfaces.LoginResultCallback;
import com.example.punchh_aarti.mvvmdemo.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity implements LoginResultCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new LoginViewModel(this));
    }

    @Override
    public void onSuccess(String str) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onError(String str) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }
}
