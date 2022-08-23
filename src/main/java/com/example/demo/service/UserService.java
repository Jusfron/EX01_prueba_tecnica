package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserDAO;
import com.example.demo.dto.User;

@Service
public class UserService {
	
	@Autowired IUserDAO iUserDAO;
	
	public List<User> listUsers() {
		return iUserDAO.findAll();
	} 
	
	public User saveUser(User user) {
		return iUserDAO.save(user);
	}
	
	public User userXID(int id) {
		return iUserDAO.findById(id).get();
	}
	
	public User updateUser(User user) {
		return iUserDAO.save(user);
	} 
	
	public void deleteUser(int id) {
		iUserDAO.deleteById(id);;
	} 
}
