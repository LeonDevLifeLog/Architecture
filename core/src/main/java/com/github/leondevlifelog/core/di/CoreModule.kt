package com.github.leondevlifelog.core.di

import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.github.leondevlifelog.core.CoreApp
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides

@Module
class CoreModule {
    @ForApplication
    @Provides
    fun providerSharedPreference(context: CoreApp): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @ForApplication
    @Provides
    fun providerGson(): Gson {
        return GsonBuilder().create()
    }
}