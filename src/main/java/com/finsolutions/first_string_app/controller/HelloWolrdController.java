package com.finsolutions.first_string_app.controller;


import com.finsolutions.first_string_app.domain.User;
import com.finsolutions.first_string_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWolrdController {


    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Leo Jesus",   48);
    }


    @PostMapping("")
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World " + body.getName();
    }

}
