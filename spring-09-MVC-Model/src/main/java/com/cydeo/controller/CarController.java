package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    //http://localhost:8080/info2?make=Hyundai
    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model){

        model.addAttribute("make", make);
        return "car/car-info";
    }

    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "Lexus") String make, Model model){

        model.addAttribute("make", make);
        return "car/car-info";
    }

    //http://localhost:8080/info3?make=Hyundai&year=2019
    @RequestMapping("/info3")
    public String carInfo3(@RequestParam String make, @RequestParam int year, Model model){

        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}")
    public String getcarInfo(@PathVariable String make, @PathVariable int year){

        System.out.println(make);
        System.out.println(year);

        return "car/car-info";
    }
}
