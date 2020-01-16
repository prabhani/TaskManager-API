package com.prabhani.taskmanagerapi;

import com.prabhani.taskmanagerapi.entities.Task;
import com.prabhani.taskmanagerapi.exception.TaskNotFoundException;
import com.prabhani.taskmanagerapi.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskManager {
   @Autowired
    private TaskService taskService;

    public TaskManager(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("/tasks/{name}")
    public Task getTask(@PathVariable String name){
        return taskService.getTaskDetailByName(name);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void TaskNotFoundHandler(TaskNotFoundException tx){ }

}
