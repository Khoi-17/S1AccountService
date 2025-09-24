package com.demo.s1accountserviceproject.repository;

import com.demo.s1accountserviceproject.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRolename(String name);
}
