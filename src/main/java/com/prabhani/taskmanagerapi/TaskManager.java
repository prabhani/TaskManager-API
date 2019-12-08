package com.prabhani.taskmanagerapi;

import com.prabhani.taskmanagerapi.entities.Task;
import com.prabhani.taskmanagerapi.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskManager {
@Autowired
    private TaskService taskService;

    @RequestMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

}
