package com.github.leondevlifelog.core.di

import androidx.lifecycle.ViewModelProvider
import com.github.leondevlifelog.core.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
interface ViewModelFactoryModule {

    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

}