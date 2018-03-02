package com.example.leon.daggerapplication;

import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {


    private static final String MESSAGE = "message";
    @Inject
    SharedPrefrencesHelper sharedPrefrencesHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sharedPrefrencesHelper.putString(MESSAGE, MainActivity.class.getSimpleName());

        Toast.makeText(this, sharedPrefrencesHelper.getString(MESSAGE, "nema me "), Toast.LENGTH_LONG).show();
    }
}
