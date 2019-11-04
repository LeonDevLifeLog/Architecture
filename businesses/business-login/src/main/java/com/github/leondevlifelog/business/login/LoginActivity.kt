package com.github.leondevlifelog.business.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.leondevlifelog.business.login.di.DaggerLoginComponent
import com.github.leondevlifelog.core.CoreApp
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    @set:Inject
    lateinit var text: String

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerLoginComponent.builder()
            .coreComponent((application as CoreApp).providerCoreComponent())
            .build().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvTest.text = text
    }
}
