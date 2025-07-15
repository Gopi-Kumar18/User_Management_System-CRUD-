package com.UMS.User_Management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> updateUser(Long id, User newData) {
        return userRepository.findById(id)
                .map(existing -> {
                    existing.setName(newData.getName());
                    existing.setEmail(newData.getEmail());
                    return userRepository.save(existing);
                });
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}
