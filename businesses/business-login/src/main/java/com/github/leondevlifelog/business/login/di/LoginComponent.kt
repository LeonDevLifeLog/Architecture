package com.github.leondevlifelog.business.login.di

import com.github.leondevlifelog.business.login.LoginActivity
import com.github.leondevlifelog.core.di.CoreComponent
import com.github.leondevlifelog.core.di.ForActivity
import dagger.Component

@ForActivity
@Component(
    modules = [LoginModule::class, ViewModelsModule::class],
    dependencies = [CoreComponent::class]
)
interface LoginComponent {
    fun inject(loginActivity: LoginActivity)
}
