package com.example.leon.daggerapplication.di.module;


import com.example.leon.daggerapplication.MainActivity;
import com.example.leon.daggerapplication.MainActivityModule;
import com.example.leon.daggerapplication.di.scope.ActivityScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();
}
