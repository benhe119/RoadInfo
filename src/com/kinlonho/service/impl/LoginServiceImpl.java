package com.kinlonho.service.impl;

import com.kinlonho.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean isLogin(String userName, String password) {
		if ("1".equals(userName) && "1".equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
