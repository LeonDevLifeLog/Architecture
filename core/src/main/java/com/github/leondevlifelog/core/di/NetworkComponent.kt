package com.github.leondevlifelog.core.di

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkComponent {
    @ForApplication
    @Provides
    fun providerOkhttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @ForApplication
    @Provides
    fun providerRetrofit(okhttpClient: OkHttpClient, gson: Gson): Retrofit {
        // fixme 添加baseUrl
        return Retrofit.Builder()
            .baseUrl("")
            .client(okhttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}