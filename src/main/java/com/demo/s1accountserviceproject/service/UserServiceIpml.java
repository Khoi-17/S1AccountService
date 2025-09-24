package com.demo.s1accountserviceproject.service;

import com.demo.s1accountserviceproject.model.User;
import com.demo.s1accountserviceproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIpml implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public boolean addUser(User user) {

        return userRepository.save(user)!=null;
    }

    @Override
    public List<User> findAllUsers() {
        return List.of();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
