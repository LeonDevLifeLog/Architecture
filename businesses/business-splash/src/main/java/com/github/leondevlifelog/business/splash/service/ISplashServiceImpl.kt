package com.github.leondevlifelog.business.splash.service

import com.github.leondevlifelog.router.splash.ISplashService
import com.sankuai.waimai.router.annotation.RouterService

@RouterService(interfaces = [ISplashService::class], key = ["default"], singleton = true)
class ISplashServiceImpl : ISplashService {
    override fun test(): String {
        return "hello from splash module"
    }
}