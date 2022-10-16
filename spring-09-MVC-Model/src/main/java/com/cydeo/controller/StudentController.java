package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String getStudent(Model model){

        model.addAttribute("name", "Madiyar");
        model.addAttribute("course", "MVC");

        String subject = "Spring boot";
        model.addAttribute("subject", subject);

        int id = new Random().nextInt();
        model.addAttribute("id", id);

        LocalDate dt = LocalDate.now();
        model.addAttribute("dt", dt);

        Student student = new Student(1, "Madiyar", "Damen");
        model.addAttribute("student", student);






        return "student/welcome";
    }
}


