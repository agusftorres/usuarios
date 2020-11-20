package com.rabbit.user.application.service;

import com.rabbit.user.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {

    User save(User user);
    void enable(String uuid);
    User findByUsername(String username);
    List<User> findAllByCuit(String cuit);
    Optional<User> findById(String id);
    List<User> findAll();

}
