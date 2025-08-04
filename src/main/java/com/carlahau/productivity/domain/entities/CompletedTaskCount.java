package com.carlahau.productivity.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CompletedTaskCount {

    @Id
    private Integer id;

    private int totalCompletedTasks;

    public CompletedTaskCount() {}

    public CompletedTaskCount(Integer id, int totalCompletedTasks) {
        this.id = id;
        this.totalCompletedTasks = totalCompletedTasks;
    }

    // getters and setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public int getTotalCompletedTasks() { return totalCompletedTasks; }
    public void setTotalCompletedTasks(int totalCompletedTasks) { this.totalCompletedTasks = totalCompletedTasks; }
}
