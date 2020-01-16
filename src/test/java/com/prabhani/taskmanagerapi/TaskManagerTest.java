package com.prabhani.taskmanagerapi;

import com.prabhani.taskmanagerapi.TaskManager;
import com.prabhani.taskmanagerapi.exception.TaskNotFoundException;
import com.prabhani.taskmanagerapi.TaskManagerApplication;
import com.prabhani.taskmanagerapi.entities.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
//import static org.mockito.Matchers.anyString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(TaskManager.class)
public class TaskManagerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TaskManager taskManager;

    @Test
    public void getTask_shouldReturnTask() throws  Exception{
         given(taskManager.getTask(anyString())).willReturn(new Task("cleaningHouse"));
         mockMvc.perform(MockMvcRequestBuilders.get("/tasks/cleaningHouse")).
                andExpect(status().isOk())
                .andExpect(jsonPath("name").value("cleaningHouse"))
                        .andExpect(jsonPath("status").value("NOT_STARTED"));
    }

    @Test
    public void getTask_notFound() throws Exception {
        given(taskManager.getTask(anyString())).willThrow(new TaskNotFoundException());
        mockMvc.perform(MockMvcRequestBuilders.get("/tasks/cleaningHouse")).andExpect(status().isNotFound());
    }


}
