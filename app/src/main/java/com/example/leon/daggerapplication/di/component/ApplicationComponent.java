package com.example.leon.daggerapplication.di.component;

import android.app.Application;

import com.example.leon.daggerapplication.MainApplication;
import com.example.leon.daggerapplication.di.module.ActivityBindingModule;
import com.example.leon.daggerapplication.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {ApplicationModule.class, ActivityBindingModule.class, AndroidSupportInjectionModule.class})
public interface ApplicationComponent extends AndroidInjector<MainApplication> {

    // Gives us syntactic sugar. we can then do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @Component.Builder
    interface Builder {
        @BindsInstance
        ApplicationComponent.Builder application(Application application);
        ApplicationComponent build();
    }
}