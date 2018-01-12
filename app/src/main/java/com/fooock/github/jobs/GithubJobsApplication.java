package com.fooock.github.jobs;

import android.app.Application;

/**
 * Base application class
 */
public abstract class GithubJobsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initialize();
    }

   /**
    *
    */
    abstract void initialize();
}