package com.example.tasktracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {

    @RequestMapping("/todo")
    public String todo() {
        return "todo";
    }

}
