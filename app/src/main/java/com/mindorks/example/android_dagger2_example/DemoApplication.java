package com.mindorks.example.android_dagger2_example;

import android.app.Application;
import android.content.Context;

import com.mindorks.example.android_dagger2_example.data.DataManager;
import com.mindorks.example.android_dagger2_example.di.component.ApplicationComponent;
import com.mindorks.example.android_dagger2_example.di.component.DaggerApplicationComponent;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule;

import jagtvax.inject.Inject;



public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                                    .builder()
                                    .applicationModule(new ApplicationModule(this))
                                    .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
