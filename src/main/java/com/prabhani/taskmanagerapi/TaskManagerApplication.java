package com.prabhani.taskmanagerapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@EnableSwagger2
@SpringBootApplication
public class TaskManagerApplication {


    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }



}
