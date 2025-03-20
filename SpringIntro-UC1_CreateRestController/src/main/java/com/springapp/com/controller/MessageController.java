package com.springapp.com.controller;

import org.springframework.web.bind.annotation.*;

//Use the @RestController and @RequestMapping Annotation
@RestController
@RequestMapping("/hello")
//Create a class MessageController to control the app request
public class MessageController {

    //Use @RequestMapping Annotation with values
    @RequestMapping(value = {"", "/"})
    //Create a method sayHello to response the request
    public String sayHello() {
        //Return the statement
        return "Hello from BridgeLabz!";
    }
}
