package com.github.leondevlifelog.service.hub.plugin

import com.github.leondevlifelog.annotation.ServiceProvider
import javassist.CtClass

class Entry {
    final CtClass ctClass
    final ServiceProvider serviceProvider

    Entry(ServiceProvider serviceProvider, CtClass ctClass) {
        this.serviceProvider = serviceProvider
        this.ctClass = ctClass
    }

    @Override
    public String toString() {
        return "Entry{" +
                "ctClass=" + ctClass +
                ", serviceProvider=" + serviceProvider +
                '}';
    }
}
