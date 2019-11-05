package com.github.leondevlifelog.business.login.di

import androidx.lifecycle.ViewModel
import com.github.leondevlifelog.business.login.LoginActivityViewModel
import com.github.leondevlifelog.core.di.ViewModelFactoryModule
import com.github.leondevlifelog.core.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [ViewModelFactoryModule::class])
abstract class ViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginActivityViewModel::class)
    abstract fun bindAddSearchViewModel(addSearchViewModel: LoginActivityViewModel): ViewModel
}