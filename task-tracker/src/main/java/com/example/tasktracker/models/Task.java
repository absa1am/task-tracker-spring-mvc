package com.example.tasktracker.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue
    private int id;
    @NotBlank(message = "Task name can not be empty")
    private String name;
    private String description;
    @Column(name = "start_date")
    @NotNull(message = "Task start date can not be empty")
    @PastOrPresent(message = "Task start date should be past or present")
    private LocalDate startDate;
    @Column(name = "end_date")
    @NotNull(message = "Task end date can not be empty")
    @FutureOrPresent(message = "Task end date should be future or present")
    private LocalDate endDate;
    @NotNull(message = "Task status can not be empty")
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
