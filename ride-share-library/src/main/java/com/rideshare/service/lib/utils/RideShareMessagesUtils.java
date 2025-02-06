package com.rideshare.service.lib.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class RideShareMessagesUtils {


    private final MessageSource messageSource;

    public String getMessageText(String msgKey) {
       return this.messageSource.getMessage(msgKey,null, Locale.ENGLISH);
    }

}
