package com.finsolutions.first_string_app.service;


import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

        public String helloWorld(String name, int idade) {
            return "Hello World " + name + " tem : " + idade + " anos" ;
        }

}
