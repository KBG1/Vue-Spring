package com.spring.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.dao.UserDao;
import com.spring.model.dto.User;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	// C
	@Override
	public int addUser(User user) {
		return userDao.insertUser(user);
	}

	//R
	@Override
	public List<User> findAllUsers() {
		return userDao.selectAllUsers();
	}

	@Override
	public User findUserById(String id) {
		return userDao.selectUserById(id);
	}

	//U
	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	//D
	@Override
	public boolean deleteUser(String id) {
		int result = userDao.deleteUser(id);

		if (result == 0) {
			return false;
		} else {
			return true;
		}
	}

}
