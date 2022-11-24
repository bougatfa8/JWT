package com.bougatf.ahmed.service;

import java.util.List;

import  com.bougatf.ahmed.entities.Role;
import com.bougatf.ahmed.entities.User;
public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
List<User> getALLU();
}
