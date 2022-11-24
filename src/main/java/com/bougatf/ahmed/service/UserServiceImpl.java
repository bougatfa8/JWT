package com.bougatf.ahmed.service;

import com.bougatf.ahmed.entities.Role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.bougatf.ahmed.entities.User;
import com.bougatf.ahmed.repos.RoleRepository;
import com.bougatf.ahmed.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService{
@Autowired
UserRepository userRep;
@Autowired
RoleRepository roleRep;
@Bean
public PasswordEncoder encoder() {
    return new BCryptPasswordEncoder();
}
@Override
public User saveUser(User user) {
user.setPassword(encoder().encode(user.getPassword()));
return userRep.save(user);
}
@Override
public User addRoleToUser(String username, String rolename) {
User usr = userRep.findByUsername(username);
Role r = roleRep.findByRole(rolename);
usr.getRoles().add(r);
return usr;
}
@Override
public Role addRole(Role role) {
return roleRep.save(role);
}
@Override
public User findUserByUsername(String username) {
return userRep.findByUsername(username);
}
@Override
public List<User> getALLU(){
	return userRep.findAll();
}
}
