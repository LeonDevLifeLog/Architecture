package com.github.leondevlifelog.business.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginActivityViewModel @Inject constructor() : ViewModel() {
    @set:Inject
    lateinit var txt: String
    var data = MutableLiveData<String>()

    fun send(): Unit {
        data.postValue(txt)
    }
}