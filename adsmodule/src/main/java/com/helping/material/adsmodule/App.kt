package com.helping.material.adsmodule;

import android.app.Application
import com.google.android.gms.ads.MobileAds
import com.google.firebase.FirebaseApp

class App : Application() {
    var appOpenManager: AppOpenManager? = null
    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(applicationContext)
        appOpenManager = AppOpenManager(this, MySharedPref(this))

        MobileAds.initialize(
            this
        ) { initializationStatus -> //Showing a simple Toast Message to the user when The Google AdMob Sdk Initialization is Completed
        }
    }
}