package com.bougatf.ahmed.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bougatf.ahmed.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {

User findByUsername(String username);

}