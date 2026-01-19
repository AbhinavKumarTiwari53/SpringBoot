package org.example.day2part2.controller;

import org.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("/about")
    public StudentModel getStudent(){
        StudentModel student = new StudentModel(1, "Abhinav","example@mail.com");
        return student;
    }

}
