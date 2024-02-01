package com.example.tasktracker.repositories;

import com.example.tasktracker.models.Task;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TaskRepository {

    private SessionFactory sessionFactory;

    public TaskRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveTask(Task task) {
        sessionFactory.getCurrentSession().persist(task);
    }

}
