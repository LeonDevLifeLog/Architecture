package com.github.leondevlifelog.devtool_default_service

import com.github.leondevlifelog.router.splash.ISplashService
import com.sankuai.waimai.router.annotation.RouterService

@RouterService(interfaces = [ISplashService::class], key = ["default"])
class ISplashServiceDefaultImpl : ISplashService {
    override fun test(): String {
        return "test"
    }
}