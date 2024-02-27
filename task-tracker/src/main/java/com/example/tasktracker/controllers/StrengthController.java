package com.example.tasktracker.controllers;

import com.example.tasktracker.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StrengthController {

    private TaskService taskService;

    public StrengthController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/strength")
    public String strength(Model model) {
        var report = taskService.getReport();

        model.addAttribute("report", report);

        return "strength/index";
    }

}
