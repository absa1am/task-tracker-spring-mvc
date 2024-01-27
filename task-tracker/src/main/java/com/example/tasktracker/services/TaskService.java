package com.example.tasktracker.services;

import com.example.tasktracker.models.Task;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private SessionFactory sessionFactory;

    @Autowired
    public TaskService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveTask(Task task) {
        sessionFactory.getCurrentSession().persist(task);
    }

}
