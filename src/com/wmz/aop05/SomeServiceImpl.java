package com.wmz.aop05;

public class SomeServiceImpl implements ISomeService {

	@Override
	public boolean checkUser(String username, String password) 
			throws UserException{
		// TODO Auto-generated method stub
		if(!"wmz".equals(username.trim())) {
			throw new UserNameException("用户名有误");
		}else if(!"123".equals(password.trim())) {
			throw new PasswordException("密码有误");
		}
		return false;
	}

}
