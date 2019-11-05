package com.github.leondevlifelog.business.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.leondevlifelog.business.login.database.dao.UserDao
import javax.inject.Inject

class LoginActivityViewModel @Inject constructor() : ViewModel() {
    @set:Inject
    lateinit var txt: String
    @set:Inject
    lateinit var userDao: UserDao
    var data = MutableLiveData<String>()
    fun send(): Unit {
        data.postValue(txt)
    }
}