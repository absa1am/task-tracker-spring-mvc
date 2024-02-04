package com.example.tasktracker.repositories;

import com.example.tasktracker.models.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TaskRepository {

    private SessionFactory sessionFactory;

    public TaskRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Task> getAll() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("FROM Task", Task.class).getResultList();
    }

    public void saveTask(Task task) {
        sessionFactory.getCurrentSession().persist(task);
    }

}
