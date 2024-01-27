package com.example.tasktracker.controllers;

import com.example.tasktracker.models.Task;
import com.example.tasktracker.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String todo(Model model) {
        model.addAttribute("task", new Task());

        return "todo";
    }

    @RequestMapping(value = "/todo", method = RequestMethod.POST)
    public String todo(@ModelAttribute("task") Task task) {
        System.out.println(task.getName());

        taskService.saveTask(task);

        return "tasks";
    }

    @RequestMapping(value = { "/tasks" })
    public String tasks() {
        return "task";
    }

}
