package com.demo.s1accountserviceproject.controller;


import com.demo.s1accountserviceproject.model.User;
import com.demo.s1accountserviceproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getByUsername")
    public ResponseEntity<?> findUserByUsername(@RequestBody  String username) {
        return ResponseEntity.ok(userService.findUserByUsername(username));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }
}
