package com.example.test1;

import com.example.test1.entity.Sex;
import com.example.test1.entity.User;
import com.example.test1.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {
        UserService service;
        SpringApplication.run(Test1Application.class, args);
        User user1 = new User("Ivan","Kolbasa",22, Sex.MALE);
        User user2 = new User("Maria","Kolbasa",29, Sex.FMALE);
        System.out.println(user1);
        System.out.println();
    }
}