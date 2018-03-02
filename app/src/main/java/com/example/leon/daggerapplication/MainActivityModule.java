package com.example.leon.daggerapplication;

import android.widget.Toast;

import com.example.leon.daggerapplication.di.scope.ActivityScoped;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainActivityModule {

    @Provides
    @ActivityScoped
    static Toast provideToast(MainActivity context) {
        return Toast.makeText(context, "Hello", Toast.LENGTH_LONG);
    }


}
