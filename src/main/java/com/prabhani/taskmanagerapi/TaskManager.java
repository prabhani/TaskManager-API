package com.prabhani.taskmanagerapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskManager {

    @RequestMapping("/")
    public String index() {
        System.out.println("Calling API");
        return "Greetings from Spring Boot Sumudu !!!";
    }

}
