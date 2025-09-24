package com.demo.s1accountserviceproject.service;

import com.demo.s1accountserviceproject.model.Role;
import com.demo.s1accountserviceproject.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceIpml implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public boolean addRole(Role role) {
        return roleRepository.save(role)!=null;
    }

    @Override
    public Role findByRoleName(String roleName) {
        return roleRepository.findByRolename(roleName);
    }
}
