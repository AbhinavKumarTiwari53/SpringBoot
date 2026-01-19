package org.example.day2part2.controller;

import org.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class home {

    @GetMapping("/about")
    public ArrayList<StudentModel> getStudent(){
        StudentModel student0 = new StudentModel(1, "Abhinav","example@mail.com");
        StudentModel student1 = new StudentModel(2, "Ram","Ram@mail.com");
        StudentModel student2 = new StudentModel(3, "Ansh","Ansh@mail.com");
        StudentModel student3 = new StudentModel(4, "Arpit","Arpit@mail.com");
        StudentModel student4 = new StudentModel(5, "Mayank","Mayank@mail.com");

        ArrayList<StudentModel> li=new ArrayList<>();
        li.add(student0);
        li.add(student1);
        li.add(student2);
        li.add(student3);
        li.add(student4);

        return li;
    }

}
