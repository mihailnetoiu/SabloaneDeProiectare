package com.controllers;

import com.examples.UserComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestControllerExample {
    private UserComponent userComponent;

    public RestControllerExample(UserComponent clientComponent) {
        this.userComponent = clientComponent;
    }

    @GetMapping("")
    public String getData(){
        userComponent.use();
        return "Some data.";
    }

}
