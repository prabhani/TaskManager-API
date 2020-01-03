package com.prabhani.taskmanagerapi.service;

import com.prabhani.taskmanagerapi.dao.TaskRepository;
import com.prabhani.taskmanagerapi.entities.Task;
import com.prabhani.taskmanagerapi.services.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureTestDatabase
public class TaskCacheTest {
    @MockBean
    private TaskRepository taskRepository;

    @Autowired
    private TaskService taskService;

@Test
    public void testGivenTask_shouldRetureCachedTask(){
        given(taskRepository.findByName(anyString())).willReturn(new Task("cleaningHouse"));
        taskService.getTaskDetailByName("cleaningHouse");
        taskService.getTaskDetailByName("cleaningHouse");
        verify(taskRepository, times(1)).findByName("cleaningHouse");
    }

}
