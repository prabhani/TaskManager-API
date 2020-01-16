package com.prabhani.taskmanagerapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Date startDateTime;
    private Date endDateTime;
    private String status;

    protected Task() {
    }

    public Task(String name, Date startDateTiem, String status) {
        this.name = name;
        this.startDateTime = startDateTiem;
        this.status = status;
    }

    public Task(String name) {
        this.name = name;
        this.startDateTime = new Date();
        this.status = TaskStatus.NOT_STARTED.name();
    }

    public void setName(String name) {
        this.name = name;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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
