package com.spring.model.dao;

import java.util.List;

import com.spring.model.dto.User;

public interface UserDao {
	//C
	int insertUser(User user);
	//R
	List<User> selectAllUsers();
	
	User selectUserById(String id);
	//U
	int updateUser(User user);
	//D
	int deleteUser(String id);
}
