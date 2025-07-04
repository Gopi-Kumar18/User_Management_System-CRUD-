package com.UMS.User_Management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User u) {
        u.setId(null);
        return userRepository.save(u);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
