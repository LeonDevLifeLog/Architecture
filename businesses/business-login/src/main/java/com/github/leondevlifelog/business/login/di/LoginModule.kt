package com.github.leondevlifelog.business.login.di

import androidx.room.Room
import com.github.leondevlifelog.business.login.database.LoginDatabase
import com.github.leondevlifelog.business.login.database.dao.UserDao
import com.github.leondevlifelog.business.login.network.ApiService
import com.github.leondevlifelog.core.CoreApp
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

    @ForActivity
    @Provides
    fun providerDatabase(coreApp: CoreApp): LoginDatabase {
        return Room.databaseBuilder(coreApp, LoginDatabase::class.java, "login-database.db").build()
    }

    @ForActivity
    @Provides
    fun providerUserDao(loginDatabase: LoginDatabase): UserDao {
        return loginDatabase.userDao()
    }
}