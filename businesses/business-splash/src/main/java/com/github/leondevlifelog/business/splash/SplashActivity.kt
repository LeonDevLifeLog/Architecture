package com.github.leondevlifelog.business.splash

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.leondevlifelog.business.splash.R.layout
import com.github.leondevlifelog.core.ServiceHub
import com.github.leondevlifelog.router.ILoginService

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_splash)
        var service =
            ServiceHub.getService(ILoginService::class.java).newInstance() as ILoginService
        Toast.makeText(this, service.test(), Toast.LENGTH_SHORT).show()
    }
}