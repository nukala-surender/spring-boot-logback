package com.examples.logback.controllers;

import com.examples.interview.models.User;
import com.examples.logback.service.HelloService;
import com.examples.logback.utils.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public User userDetails(){
        logger.info("info message");
        logger.debug("debug message");
        ExceptionUtils.logError("Error message in controller");
        helloService.printMessage();
        User user = new User();
        user.setFirstName("first name");
        user.setLastName("last name");
        return user;
    }

}
