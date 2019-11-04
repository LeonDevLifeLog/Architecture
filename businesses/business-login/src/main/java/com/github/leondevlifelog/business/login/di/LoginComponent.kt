package com.github.leondevlifelog.business.login.di

import com.github.leondevlifelog.business.login.LoginActivity
import com.github.leondevlifelog.core.di.CoreComponent
import dagger.Component

@Component(modules = [LoginModule::class], dependencies = [CoreComponent::class])
interface LoginComponent {
    fun inject(loginActivity: LoginActivity)
}
