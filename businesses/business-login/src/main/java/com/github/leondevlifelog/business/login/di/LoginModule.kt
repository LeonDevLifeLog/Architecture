package com.github.leondevlifelog.business.login.di

import dagger.Module
import dagger.Provides

@Module
class LoginModule {
    @Provides
    fun providerString(): String {
        return "hello login module"
    }
}