package com.demo.s1accountserviceproject.config;


import com.demo.s1accountserviceproject.model.Role;
import com.demo.s1accountserviceproject.model.User;
import com.demo.s1accountserviceproject.service.RoleService;
import com.demo.s1accountserviceproject.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitiallizer implements CommandLineRunner{

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        Role role = new Role();
        role.setRolename("admin");
        roleService.addRole(role);

        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setEmail("khoi@gmail.com");
        userService.addUser(user);
    }
}

