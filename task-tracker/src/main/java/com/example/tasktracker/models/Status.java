package com.example.tasktracker.models;

public enum Status {

    PENDING("Pending"),
    PROCESSING("Processing"),
    COMPLETED("Completed"),
    BACKLOG("Backlog");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
