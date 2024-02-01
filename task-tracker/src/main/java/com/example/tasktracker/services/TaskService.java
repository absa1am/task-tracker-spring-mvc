package com.example.tasktracker.services;

import com.example.tasktracker.models.Task;
import com.example.tasktracker.repositories.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void saveTask(Task task) {
        taskRepository.saveTask(task);
    }

}
