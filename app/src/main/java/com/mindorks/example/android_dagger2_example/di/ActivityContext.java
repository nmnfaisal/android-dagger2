package com.mindorks.example.android_dagger2_example.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;



@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}
