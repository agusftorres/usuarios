package com.rabbit.user.application.service.impl;

import com.rabbit.user.application.repository.UserRepository;
import com.rabbit.user.application.service.UserService;
import com.rabbit.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository  userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void enable(String uuid) {

    }

    @Override
    public User findByUsername(String username) {
        //TODO
        return null;
    }

    @Override
    public List<User> findAllByCuit(String cuit) {
        //TODO
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }
}
