package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired UserService userService;
	
	@GetMapping("/users")
	public List<User> listUsers(){
		return userService.listUsers();
	}

}
