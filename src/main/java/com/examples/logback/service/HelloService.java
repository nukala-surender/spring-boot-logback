package com.examples.logback.service;

import com.examples.logback.utils.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public void printMessage(){
        logger.info("info message in hello service");
        ExceptionUtils.logError("error message logging from hello service");
    }
}
