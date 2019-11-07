package com.github.leondevlifelog.router

import android.content.Context

interface ILoginService {
    fun test(): String
    fun gotoLoginActivity(context: Context)
}