package com.example.demo.util.common.util;

import org.springframework.util.StringUtils;

public class URLUtil {
    public static String removeLastSlash(String url) {
        return !StringUtils.isEmpty(url) && url.endsWith("/") ? url.substring(0, url.length() - 1) : url;
    }

    private URLUtil() {
    }
}

