package com.github.leondevlifelog.router.login

import android.content.Context

interface ILoginService {
    fun test(): String
    fun gotoLoginActivity(context: Context)
}