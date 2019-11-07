package com.github.leondevlifelog.service

import android.content.Context
import android.widget.Toast
import com.github.leondevlifelog.router.login.ILoginService
import com.sankuai.waimai.router.annotation.RouterService

@RouterService(interfaces = [ILoginService::class], key = ["default"])
class ILoginServiceDefaultImpl : ILoginService {
    override fun gotoLoginActivity(context: Context) {
        Toast.makeText(context, "这是mock，出现说明可以跳到登录页面", Toast.LENGTH_SHORT).show()
    }

    override fun test(): String {
        return "ILoginServiceDefaultImpl"
    }
}