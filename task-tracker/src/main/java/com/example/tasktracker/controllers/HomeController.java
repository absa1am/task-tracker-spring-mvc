package com.example.tasktracker.controllers;

import com.example.tasktracker.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private TaskService taskService;

    public HomeController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String index(Model model) {
        var tasks = taskService.getTasks();

        model.addAttribute("tasks", tasks);

        return "index";
    }

}
