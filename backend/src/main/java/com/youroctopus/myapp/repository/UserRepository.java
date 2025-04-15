package com.youroctopus.myapp.repository;

import com.youroctopus.myapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> findAll(){
        return users;
    }

    void create(User user){
        users.add(user);
    }
}
