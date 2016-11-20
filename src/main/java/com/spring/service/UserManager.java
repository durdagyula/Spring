package com.spring.service;

import com.spring.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(User u)
    {
        users.add(u);
    }

    public void removeUser(User u)
    {
        users.remove(u);
    }

    public List<User> getUsers() {
        return users;
    }
}