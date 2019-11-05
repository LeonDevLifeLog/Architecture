package com.github.leondevlifelog.business.login.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.github.leondevlifelog.business.login.database.entity.UserEntity

@Dao
abstract class UserDao {
    @Query("select * from userentity where id =:id")
    abstract fun findBy(id: Long): UserEntity
}