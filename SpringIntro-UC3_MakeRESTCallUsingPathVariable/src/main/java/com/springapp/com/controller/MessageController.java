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


    //Use @GetMapping Annotation with value parameter
    @GetMapping(value = ("/query"))
    //Create a method sayHello which accept a query parameter name
    public String sayHello(@RequestParam(value = "name") String name) {
        //Return the response of request
        return "Hello " + name + "!";
    }

    //Use @GetMapping Annotation with parameter
    @GetMapping("/param/{name}")
    //Create a method sayHelloParam which accept a path variable name
    public String sayHelloParam(@PathVariable String name) {
        //Return the result
        return "Hello " + name + " from BridgeLabz!";
    }
}
