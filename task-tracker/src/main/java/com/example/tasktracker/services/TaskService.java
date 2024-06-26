package com.example.tasktracker.services;

import com.example.tasktracker.models.Task;
import com.example.tasktracker.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks() {
        return taskRepository.getAll();
    }

    public Task getTask(int id) {
        return taskRepository.getTask(id);
    }

    public Map<String, Integer> getReport() {
        var tasks = getTasks();
        Map<String, Integer> report = new HashMap<>();

        report.put("Total", 0);
        report.put("Pending", 0);
        report.put("Processing", 0);
        report.put("Completed", 0);
        report.put("Backlog", 0);

        for (var task : tasks) {
            var status = task.getStatus().value();

            report.put("Total", report.get("Total") + 1);
            report.put(status, report.get(status) + 1);
        }

        return report;
    }

    public void saveTask(Task task) {
        taskRepository.saveTask(task);
    }

    public void updateTask(Task newTask, int id) {
        Task oldTask = taskRepository.getTask(id);

        oldTask.setId(newTask.getId());
        oldTask.setName(newTask.getName());
        oldTask.setDescription(newTask.getDescription());
        oldTask.setStartDate(newTask.getStartDate());
        oldTask.setEndDate(newTask.getEndDate());
        oldTask.setStatus(newTask.getStatus());

        taskRepository.updateTask(oldTask);
    }

}
