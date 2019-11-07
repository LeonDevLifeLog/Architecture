package com.github.leondevlifelog.business.login.service

import android.content.Context
import com.github.leondevlifelog.business.login.LoginActivity
import com.github.leondevlifelog.router.ILoginService
import com.sankuai.waimai.router.annotation.RouterService

@RouterService(interfaces = [ILoginService::class], key = ["default"])
class LoginServiceImpl : ILoginService {
    override fun gotoLoginActivity(context: Context) {
        LoginActivity.startMe(context)
    }

    override fun test(): String {
        return "hello from Login Service"
    }
}