package com.braunster.androidchatsdk.app;

import android.app.Application;

import com.braunster.chatsdk.network.BFacebookManager;
import com.braunster.chatsdk.network.BFirebaseNetworkAdapter;
import com.braunster.chatsdk.network.BNetworkManager;

//import com.braunster.network.BFacebookManager;

/**
 * Created by itzik on 6/8/2014.
 */
public class AppObj extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BNetworkManager.init(getApplicationContext());
        BFacebookManager.init("247787328762280", getApplicationContext());
        BFirebaseNetworkAdapter adapter = new BFirebaseNetworkAdapter();
        BNetworkManager.sharedManager().setNetworkAdapter(adapter);
    }
}