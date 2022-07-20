package com.java.usermanagement.service;

import com.java.usermanagement.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    User addUser(User user);

    User updateUser(User user);

    User deleteUser(int id);
}