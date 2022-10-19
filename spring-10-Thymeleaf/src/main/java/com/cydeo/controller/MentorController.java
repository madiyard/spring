package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/mentor")
public class MentorController {


        @GetMapping("/register") // localhost:8080/mentor/register
        public String register( Model model){

            List<String> batchList = Arrays.asList("JD1", "JD2", "JD3");
            model.addAttribute("batchList", batchList);

            model.addAttribute("mentor", new mentor());

            return "mentor/mentor-register";
        }
        @PostMapping("/confirm")
        public String submitForm(@ModelAttribute("mentor") mentor Mentor){

             //   return "mentor/mentor-confirmation";


            return "redirect:/mentor/register";
        }


    }

