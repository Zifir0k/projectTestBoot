package com.example.projectTestBoot.dao;

import com.example.projectTestBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserId(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}
