package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Home {

    @GetMapping("/")
    public String hello(){
        return "home";
    }

    @GetMapping("/contact")
    public String hllo(){
        return "contact";
    }

    @GetMapping("/about")
    public String hell(){
        return "about";
    }
}
