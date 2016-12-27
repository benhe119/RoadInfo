package com.kinlonho.service.impl;

import java.util.List;

import com.kinlonho.dao.UserDao;
import com.kinlonho.entity.User;
import com.kinlonho.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public List<User> findUsers() {
		return userDao.findUsers();
	}

}
