package com.spring.model.service;

import java.util.List;

import com.spring.model.dto.User;

public interface UserService {
	int addUser(User user);
	
	List<User> findAllUsers();
	
	User findUserById(String id);
	
	int updateUser(User user);
	
	boolean deleteUser(String id);
}
