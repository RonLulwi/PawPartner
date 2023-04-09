package com.ronlu.myapplication;

import android.app.Application;
import android.content.Context;

import com.ronlu.myapplication.utils.MSP;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MSP.initHelper(this);
    }

    public Context getAppContext(){
        return getApplicationContext();
    }
}
