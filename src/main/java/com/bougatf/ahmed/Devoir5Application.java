package com.bougatf.ahmed;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bougatf.ahmed.entities.Role;
import com.bougatf.ahmed.entities.User;
import com.bougatf.ahmed.service.UserService;

@SpringBootApplication
public class Devoir5Application {

	public static void main(String[] args) {
		SpringApplication.run(Devoir5Application.class, args);
		
		
	}
	

	
	
	
	


}
