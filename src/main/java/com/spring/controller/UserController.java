package com.spring.controller;

import com.spring.model.User;
import com.spring.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserManager um;

    @RequestMapping(value = "/admin/listUsers")
    public String listUsers() {
        return "listUsers";
    }

    @ModelAttribute(value = "users")
    public User[] getUserList() {
        return um.getUsers().toArray(new User[um.getUsers().size()]);
    }
}