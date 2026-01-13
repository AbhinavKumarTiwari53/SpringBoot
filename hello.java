package com.example.Day_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/")

    public String hello(){
        return "Welcome To SpringBoot";
    }

    @GetMapping("/user")

    public String hi(){
        return "Hi User!";
    }

    @GetMapping("/git")

    public String git(){
        return "https://github.com/AbhinavKumarTiwari53/SpringBoot.git";
    }
}
