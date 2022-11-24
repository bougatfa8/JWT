package com.bougatf.ahmed.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bougatf.ahmed.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}