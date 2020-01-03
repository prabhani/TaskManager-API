package com.prabhani.taskmanagerapi.dao;

import com.prabhani.taskmanagerapi.entities.Task;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TaskRepositoryTest {

 @Autowired
 TaskRepository taskRepository;

    @Autowired
    TestEntityManager testEntityManager;


 @Test
 public void findByName_returnsTask(){
     Task savedTask = testEntityManager.persistFlushFind(new Task("cleaningHouse"));
     Task retrievedTask = taskRepository.findByName("cleaningHouse");
     Assertions.assertThat(retrievedTask.getName()).isEqualTo(savedTask.getName());
     Assertions.assertThat(retrievedTask.getStatus()).isEqualTo(savedTask.getStatus());
 }


}
