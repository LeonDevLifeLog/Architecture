package com.github.leondevlifelog.business.login.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.leondevlifelog.business.login.database.dao.UserDao
import com.github.leondevlifelog.business.login.database.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class LoginDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}