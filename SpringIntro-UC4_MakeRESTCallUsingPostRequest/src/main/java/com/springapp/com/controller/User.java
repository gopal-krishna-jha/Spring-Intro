package com.springapp.com.controller;

//Create a class user  to store the user details
public class User {

    //Create private variable to store the first and last name of the user
    private String firstName;
    private String lastName;

    //Create a getter method to get firstName
    public String getFirstName() {
        return firstName;
    }

    //Create a setter method to set the firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Create a getter method to get lastName
    public String getLastName() {
        return lastName;
    }

    //Create a setter method to set the lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
