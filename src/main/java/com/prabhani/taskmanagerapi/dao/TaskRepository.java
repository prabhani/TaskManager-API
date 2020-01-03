package com.prabhani.taskmanagerapi.dao;

import com.prabhani.taskmanagerapi.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, String> {

    public Task findByName(String taskName) ;

}
