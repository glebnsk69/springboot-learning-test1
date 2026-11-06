package com.example.test1.service;

import com.example.test1.entity.User;
import com.example.test1.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findById(Long id){

        return repository.findById(id).orElse(null);

    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public User createUser(User user){
        return repository.save(user);
    }

    public User deleteById(Long id){
        User user = findById(id);
        if(user==null)return null;

        repository.deleteById(id);
        return user;
    }

    public User updateUser(Long id, User newUser){
        if (newUser==null) return null;
        User user = findById(id);
        if(user==null)return null;
        user.updateUser(newUser);

        repository.save(user);
        return user;
    }
}
