package com.example.demo.controllers;

import objects.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/getUserDetails")
    public String getUserDetails(@RequestHeader String name){
        return "Requesting details of User"+name;
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody Person person){
        return "Hello from Update!"+person.getName();
    }

    @PostMapping("/createUser")
    public String createNewUser(@RequestBody Person person){
        return "Creater User" +person.getName();
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestBody Person person){
        return "Hello from Delete!"+person.getName();
    }

}
