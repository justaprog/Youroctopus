package com.youroctopus.myapp.controller;

import com.youroctopus.myapp.model.Review;
import com.youroctopus.myapp.model.User;
import com.youroctopus.myapp.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("")
    List<User> findAll(){
        return userRepository.findAll();
    }
}
