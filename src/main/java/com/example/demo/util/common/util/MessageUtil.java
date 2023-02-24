package com.example.demo.util.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

//@Component
@Component
public class MessageUtil {
//    private static ResourceBundleMessageSource messageSource;

//    @Autowired
//    MessageUtil(ResourceBundleMessageSource messageSource) {
//        MessageUtil.messageSource = messageSource;
//    }

    public static String getMessage(String messageKey) {
        Locale locale = LocaleContextHolder.getLocale();
//        return messageSource.getMessage(messageKey, (Object[])null, locale);
        return messageKey;
    }

    public static String getMessage(String messageKey, String... args) {
        Locale locale = LocaleContextHolder.getLocale();
//        return messageSource.getMessage(messageKey, args, locale);
        return messageKey;
    }
}
