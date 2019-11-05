package com.github.leondevlifelog.business.login.di

import com.github.leondevlifelog.business.login.network.ApiService
import com.github.leondevlifelog.core.di.ForActivity
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class LoginModule {
    @Provides
    fun providerString(): String {
        return "hello login module"
    }

    @ForActivity
    @Provides
    fun providerApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}