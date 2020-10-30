package com.examples.logback.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionUtils {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionUtils.class);
    public static void logError(String message, Throwable t){
        logger.error(message, t);
    }

    public static void logError(String message){
        logger.error(message);
    }
}
