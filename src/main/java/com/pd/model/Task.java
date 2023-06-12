package com.pd.model;

import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private LocalDate dueData;
    public Task() {

    }
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDueData() {
        return dueData;
    }

    public void setDueData(LocalDate dueData) {
        this.dueData = dueData;
    }
}
