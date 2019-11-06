package com.github.leondevlifelog.core;

import java.util.HashMap;
import java.util.Map;

public class ServiceHub {
    private static final Map<Class, Class> CONFIG = new HashMap<>();

    public static Class getService(Class parent) {
        return CONFIG.get(parent);
    }
}
