package com.example.tasktracker.controllers;

import com.example.tasktracker.models.Status;
import com.example.tasktracker.models.Task;
import com.example.tasktracker.services.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public String index(Model model) {
        var tasks = taskService.getTasks();

        model.addAttribute("tasks", tasks);

        return "task";
    }

    @GetMapping("/todo")
    public String createTodo(Model model) {
        model.addAttribute("task", new Task());
        model.addAttribute("status", Status.values());

        return "todo";
    }

    @PostMapping("/todo")
    public String createTodo(@Valid @ModelAttribute("task") Task task, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("status", Status.values());

            return "todo";
        }

        taskService.saveTask(task);

        return "redirect:/tasks";
    }

}
