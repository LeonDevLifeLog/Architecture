package com.github.leondevlifelog.core

import com.github.leondevlifelog.core.di.DaggerCoreComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerCoreComponent.factory().create(this)
    }
}