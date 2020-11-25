package com.rabbit.user.adapter.controller;

import com.rabbit.user.adapter.controller.model.UserResponse;
import com.rabbit.user.application.service.UserService;
import com.rabbit.user.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        log.info("Llamando a /api/v1/user/id para obtener usuario con id: {}", id);
        Optional<User> user = userService.findById(id);
        return user.get();
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        log.info("Llamando a /api/v1/user/all para obtener usuarios");
        return userService.findAll();
    }
    
}
