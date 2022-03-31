package com.example.demo

import android.app.Application
import com.testfairy.TestFairy

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        TestFairy.begin(this, "SDK-DxnP94AH")
        instance = this
    }

    companion object {
        lateinit var instance: MyApp
            private set
    }
}