package com.example.demo.util;

import javax.annotation.Nullable;

public class StringUtil {

    public static boolean stringIsNullOrEmpty(@Nullable String string) {
        return string == null || string.isEmpty();
    }

    public static boolean stringIsNullOrEmptyBlank(@Nullable String string) {
        return string == null || string.isEmpty() || string.trim().isEmpty();
    }
}
