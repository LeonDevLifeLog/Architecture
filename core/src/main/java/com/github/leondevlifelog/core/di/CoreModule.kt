package com.github.leondevlifelog.core.di

import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.github.leondevlifelog.core.CoreApp
import dagger.Module
import dagger.Provides

@Module
class CoreModule {
    @ForApplication
    @Provides
    fun providerSharedPreference(context: CoreApp): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}