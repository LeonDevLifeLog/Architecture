package com.github.leondevlifelog.business.login.service;

import com.github.leondevlifelog.annotation.ServiceProvider;
import com.github.leondevlifelog.router.ILoginService;

import org.jetbrains.annotations.NotNull;

@ServiceProvider(parent = ILoginService.class)
public class LoginServiceImpl implements ILoginService {
    @NotNull
    @Override
    public String test() {
        return "hello from Login Service";
    }
}
