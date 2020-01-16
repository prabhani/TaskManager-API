package com.prabhani.taskmanagerapi;

import com.prabhani.taskmanagerapi.entities.Task;

import com.prabhani.taskmanagerapi.entities.TaskStatus;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaskManagerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

//    @Test
//    public void getTask_shouldReturnGetTaskDetails(){
//        //arange
//
//        //act
//        ResponseEntity<Task> response = restTemplate.getForEntity("/tasks/cleaningHouse", Task.class);
//
//
//        //assert
//         Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//         Assertions.assertThat(response.getBody().getName()).isEqualTo("cleaningHouse");
//        Assertions.assertThat(response.getBody().getStatus()).isEqualTo(TaskStatus.NOT_STARTED);
//    }
}
