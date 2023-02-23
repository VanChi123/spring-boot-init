package com.example.demo.util;

import java.util.UUID;

public class UUIDUtil {
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    private UUIDUtil() {
    }
}

