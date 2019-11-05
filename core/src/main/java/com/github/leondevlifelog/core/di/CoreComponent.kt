package com.github.leondevlifelog.core.di

import android.content.SharedPreferences
import com.github.leondevlifelog.core.CoreApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import okhttp3.OkHttpClient

@ForApplication
@Component(
    modules = [AndroidInjectionModule::class, CoreModule::class,
        NetworkComponent::class
    ]
)
interface CoreComponent : AndroidInjector<CoreApp> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance instance: CoreApp): CoreComponent
    }

    fun sharedPreferences(): SharedPreferences
    fun okHttpClient(): OkHttpClient
}