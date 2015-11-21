package com.apps.wanjugu.shoeshack;

import android.app.Application;


import com.facebook.FacebookSdk;

/**
 * Created by iWanjugu on 21/11/2015.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        // Initialize the SDK before executing any other operations,
        // especially, if you're using Facebook UI elements.
    }
}
