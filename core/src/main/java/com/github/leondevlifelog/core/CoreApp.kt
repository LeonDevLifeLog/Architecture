package com.github.leondevlifelog.core

import com.github.leondevlifelog.core.di.CoreComponent
import com.github.leondevlifelog.core.di.CoreComponentProvider
import com.github.leondevlifelog.core.di.DaggerCoreComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class CoreApp : DaggerApplication(), CoreComponentProvider {
    private lateinit var coreComponent: CoreComponent

    override fun onCreate() {
        coreComponent = DaggerCoreComponent.factory().create(this)
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return coreComponent
    }

    override fun providerCoreComponent(): CoreComponent {
        return coreComponent
    }
}