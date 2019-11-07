package com.github.leondevlifelog.service

import com.github.leondevlifelog.router.splash.ISplashService
import com.sankuai.waimai.router.annotation.RouterService

@RouterService(interfaces = [ISplashService::class], key = ["default"])
class ISplashServiceDefaultImpl : ISplashService {
    override fun test(): String {
        return "test"
    }
}