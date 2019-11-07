package com.github.leondevlifelog.business.login.service;

import com.github.leondevlifelog.router.ILoginService;

import org.jetbrains.annotations.NotNull;

public class LoginServiceImpl implements ILoginService {
    @NotNull
    @Override
    public String test() {
        return "hello from Login Service";
    }
}
