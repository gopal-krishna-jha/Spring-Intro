package com.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Use @SpringBootApplication Annotation
@SpringBootApplication
//Create a class HelloMessagingApplication to start application
public class HelloMessagingApplication {

    //main method to run the program
    public static void main(String[] args) {
        //Call the run method to run the application
        SpringApplication.run(HelloMessagingApplication.class, args);
    }
}
