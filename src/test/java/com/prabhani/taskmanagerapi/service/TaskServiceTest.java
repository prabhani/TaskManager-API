package com.prabhani.taskmanagerapi.service;

import com.prabhani.taskmanagerapi.dao.TaskRepository;
import com.prabhani.taskmanagerapi.entities.Task;
import com.prabhani.taskmanagerapi.exception.TaskNotFoundException;
import com.prabhani.taskmanagerapi.services.TaskService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class TaskServiceTest {
    @Mock
    private TaskRepository taskRepository;

    private TaskService taskService;

    @Before
    public void setUp(){
        taskService = new TaskService(taskRepository);
    }

    @Test
    public void getTaskDetails_returnsTaskInfo(){
       given(taskRepository.findByName("cleaningHouse")).willReturn(new Task("cleaningHouse"));
       Task task = taskService.getTaskDetailByName("cleaningHouse");
       Assertions.assertThat(task.getName()).isEqualTo("cleaningHouse");
    }

    @Test(expected= TaskNotFoundException.class)
    public void getTaskDetail_whenTaskNotFound(){
      given(taskRepository.findByName("running")).willReturn(null);
        taskService.getTaskDetailByName("running");
    }

}
