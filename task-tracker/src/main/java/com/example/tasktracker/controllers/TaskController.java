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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/task")
    public String index(Model model) {
        var tasks = taskService.getTasks();

        model.addAttribute("tasks", tasks);

        return "task/index";
    }

    @GetMapping("/task/create")
    public String create(Model model) {
        model.addAttribute("task", new Task());
        model.addAttribute("status", Status.values());

        return "task/create";
    }

    @PostMapping("/task/create")
    public String create(@Valid @ModelAttribute("task") Task task, Errors errors, Model model, RedirectAttributes redirectAttributes) {
        if (errors.hasErrors()) {
            model.addAttribute("status", Status.values());

            return "task/create";
        }

        taskService.saveTask(task);

        redirectAttributes.addFlashAttribute("message", "New task created successfully.");

        return "redirect:/task";
    }

    @GetMapping("/task/{id}/update")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("task", taskService.getTask(id));
        model.addAttribute("status", Status.values());

        return "task/update";
    }

    @PostMapping("/task/{id}/update")
    public String update(@PathVariable("id") int id, @Valid @ModelAttribute("task") Task task, Errors errors, Model model, RedirectAttributes redirectAttributes) {
        if (errors.hasErrors()) {
            model.addAttribute("status", Status.values());

            return "task/update";
        }

        taskService.updateTask(task, id);

        redirectAttributes.addFlashAttribute("message", "Task updated successfully.");

        return "redirect:/task";
    }

}
