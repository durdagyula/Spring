package com.spring.controller;

import com.spring.model.User;
import com.spring.model.enums.Color;
import com.spring.model.enums.Gender;
import com.spring.model.enums.School;
import com.spring.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AdminController {

    @Autowired
    UserManager um;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@Valid @ModelAttribute("user") User user, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "addUser";
        }
        um.addUser(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String getForm(@ModelAttribute("user") User user)
    {
        return "addUser";
    }

    @ModelAttribute("genders")
    public Gender[] genders() {
        return Gender.values();
    }
    @ModelAttribute("schools")
    public School[] schools() {
        return School.values();
    }
    @ModelAttribute("colors")
    public Color[] colors() {
        return Color.values();
    }
}