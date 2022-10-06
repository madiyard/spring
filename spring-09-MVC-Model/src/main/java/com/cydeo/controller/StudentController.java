package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String getStudent(Model model){

        model.addAttribute("name", "Madiyar");
        model.addAttribute("course", "MVC");
        return "student/welcome";
    }
}


