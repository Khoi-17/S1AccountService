package com.demo.s1accountserviceproject.service;

import com.demo.s1accountserviceproject.model.User;

import java.util.List;

public interface UserService {

    public User findUserByUsername(String username);

    public boolean addUser(User user);

    public List<User> findAllUsers();

    public User findById(Long id);
}
