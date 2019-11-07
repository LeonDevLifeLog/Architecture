package com.github.leondevlifelog.business.splash

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.leondevlifelog.router.login.ILoginService
import com.sankuai.waimai.router.Router

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val iLoginService: ILoginService? = Router.getService(
            ILoginService::class.java, "default"
        )
        Toast.makeText(this, iLoginService?.test(), Toast.LENGTH_SHORT).show()
        iLoginService?.gotoLoginActivity(this)
    }
}