package com.prabhani.taskmanagerapi.services;

import com.prabhani.taskmanagerapi.entities.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TaskService {

    private ConcurrentHashMap tasks;

    {
        tasks = new ConcurrentHashMap<Integer,Task>();
    }

    public List<Task> getAllTasks(){
        tasks.put(1, new Task("Eat"));
        List<Task> allTasks = new ArrayList<Task>();
        allTasks.addAll(tasks.values());
        return allTasks;
    }

}
