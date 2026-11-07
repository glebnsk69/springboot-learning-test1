package com.example.test1.config;

import com.example.test1.entity.Sex;
import com.example.test1.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.test1.repository.UserRepository;
import com.example.test1.service.UserService;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final UserService userService;
    private final UserRepository repository;

    public DatabaseInitializer(UserService userService,UserRepository repository) {
        this.userService = userService;
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.truncateTable();
        userService.createUser(new User("Sergey","Ivanov",23, Sex.MALE));
        userService.createUser(new User("Marina","Ozernaya",55, Sex.FMALE));
        userService.createUser(new User("Jozef","Burkly",65, Sex.MALE));

        // Здесь будет логика заполнения демо-базы

        userService.findAll().forEach(user -> System.out.println(user));
    }
}