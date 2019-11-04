package com.github.leondevlifelog.core.di

import com.github.leondevlifelog.core.CoreApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class, CoreModule::class])
interface CoreComponent : AndroidInjector<CoreApp> {
    @Component.Factory
    interface Factory : AndroidInjector.Factory<CoreApp>
}