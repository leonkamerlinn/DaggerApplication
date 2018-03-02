package com.example.leon.daggerapplication;

import android.content.SharedPreferences;

import javax.inject.Inject;

public class SharedPrefrencesHelper {


    private final SharedPreferences mSharedPrefrences;

    @Inject
    public SharedPrefrencesHelper(SharedPreferences sharedPreferences) {
        mSharedPrefrences = sharedPreferences;
    }

    public void putString(String key, String value) {
        mSharedPrefrences.edit()
                .putString(key, value)
                .apply();
    }

    public String getString(String key, String defaultValue) {
        return mSharedPrefrences.getString(key, defaultValue);
    }

    public void putInteger(String key, int value) {
        mSharedPrefrences.edit()
                .putInt(key, value)
                .apply();
    }

    public int getString(String key, int defaultValue) {
        return mSharedPrefrences.getInt(key, defaultValue);
    }

    public void putBoolean(String key, boolean value) {
        mSharedPrefrences.edit()
                .putBoolean(key, value)
                .apply();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return mSharedPrefrences.getBoolean(key, defaultValue);
    }

    public void putFloat(String key, float value) {
        mSharedPrefrences.edit()
                .putFloat(key, value)
                .apply();
    }

    public float getFloat(String key, float defaultValue) {
        return mSharedPrefrences.getFloat(key, defaultValue);
    }

}
