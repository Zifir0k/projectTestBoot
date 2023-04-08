package com.example.projectTestBoot.service;

import com.example.projectTestBoot.model.User;
import jakarta.validation.Valid;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    Object getUserId(long id);
    void addUser(User user);
    void removeUser(Long id);
    void updateUser(@Valid User user);
}
