package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/save")
    public UserDao save(@RequestBody UserDao userDao) {
        return userRepository.save(userDao);
    }

    @GetMapping("/list")
    public List<UserDao> getAll() {
        return userRepository.findAll();
    }


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
