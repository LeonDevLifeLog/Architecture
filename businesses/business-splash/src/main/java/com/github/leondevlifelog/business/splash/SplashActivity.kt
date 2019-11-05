package com.github.leondevlifelog.business.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.leondevlifelog.business.splash.R.layout

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_splash)
    }
}