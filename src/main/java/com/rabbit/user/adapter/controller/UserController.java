package com.rabbit.user.adapter.controller;

import com.rabbit.user.application.service.UserService;
import com.rabbit.user.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {

    private UserService userService;

    @GetMapping
    public User getUserById(String id){

    }
}
