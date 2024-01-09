package com.example.tasktracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StrengthController {

    @RequestMapping("/strength")
    public String strength() {
        return "strength";
    }

}
