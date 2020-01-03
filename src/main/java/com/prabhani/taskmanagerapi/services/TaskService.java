package com.prabhani.taskmanagerapi.services;

import com.prabhani.taskmanagerapi.dao.TaskRepository;
import com.prabhani.taskmanagerapi.entities.Task;
import com.prabhani.taskmanagerapi.exception.TaskNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;



@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;



    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Cacheable("tasks")
    public Task getTaskDetailByName(String taskName) {
        Task task = taskRepository.findByName(taskName);
        if (task == null) {
            throw new TaskNotFoundException();
        }
        return task;
    }


}
