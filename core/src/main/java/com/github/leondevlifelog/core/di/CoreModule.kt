package com.github.leondevlifelog.core.di

import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.github.leondevlifelog.core.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {
    @Singleton
    @Provides
    fun providerSharedPreference(context: App): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}