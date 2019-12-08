package com.prabhani.taskmanagerapi.entities;

import java.util.Date;

public class Task {

    private int taskId;
    private String taskName;
    private Date startDateTime;
    private Date endDateTime;
    private String status;

    public Task(String taskName, Date startDateTiem, String status) {
        this.taskName = taskName;
        this.startDateTime = startDateTiem;
        this.status = status;
    }

    public Task(String taskName) {
        this.taskName = taskName;
        this.startDateTime = new Date();
        this.status = TaskStatus.STARTED.name();
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public String getStatus() {
        return status;
    }
}
