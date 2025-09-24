package com.demo.s1accountserviceproject.service;


import com.demo.s1accountserviceproject.model.Role;

public interface RoleService {
    public boolean addRole(Role role);
    public Role findByRoleName(String roleName);

}
