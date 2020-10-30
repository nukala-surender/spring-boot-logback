package com.examples.logback.controllers;

import com.examples.logback.service.HelloService;
import com.examples.logback.service.HomeService;
import com.examples.logback.utils.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public com.examples.interview.models.User userDetails(){
        logger.info("info message from home controller");
        logger.debug("debug message from home controller");
        ExceptionUtils.logError("Error message from home controller");
        homeService.printMessage();
        com.examples.interview.models.User user = new com.examples.interview.models.User();
        user.setFirstName("first name");
        user.setLastName("last name");
        return user;
    }
}
