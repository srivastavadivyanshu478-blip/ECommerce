package com.ecommerce.website.controller;

import com.ecommerce.website.entity.User;
import com.ecommerce.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(User user){
        userService.saveUser(user);
        return "success";
    }
}
