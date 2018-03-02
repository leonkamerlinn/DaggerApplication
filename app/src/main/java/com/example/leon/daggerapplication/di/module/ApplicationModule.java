package com.example.leon.daggerapplication.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.leon.daggerapplication.R;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ApplicationModule {
    //expose Application as an injectable context
    @Binds
    abstract Context bindContext(Application application);


    @Provides
    static SharedPreferences provideSharedPrefrences(Context context) {
        return context.getSharedPreferences(context.getString(R.string.shared_prefrences), Context.MODE_PRIVATE);
    }
}