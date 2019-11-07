package com.github.leondevlifelog.business.login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.github.leondevlifelog.business.login.di.DaggerLoginComponent
import com.github.leondevlifelog.core.CoreApp
import com.github.leondevlifelog.router.splash.ISplashService
import com.sankuai.waimai.router.Router
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    private lateinit var viewModel: LoginActivityViewModel
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @set:Inject
    lateinit var sp: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerLoginComponent.builder()
            .coreComponent((application as CoreApp).providerCoreComponent())
            .build().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        viewModel =
            ViewModelProviders.of(this, viewModelFactory).get(LoginActivityViewModel::class.java)
        viewModel.data.observe(this, Observer {
            tvTest.text = it
        })
        viewModel.send()
        btnLogin.setOnClickListener {
            if (etUsername.text.isNotEmpty()) {
                sp.edit().putString("USER_NAME", etUsername.text.toString()).apply()
                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
            }
        }
        val iSplashService: ISplashService? =
            Router.getService(ISplashService::class.java, "default")
        Toast.makeText(this, iSplashService?.test(), Toast.LENGTH_SHORT).show()
    }

    companion object {
        fun startMe(context: Context) {
            context.startActivity(Intent(context, LoginActivity::class.java))
        }
    }
}
