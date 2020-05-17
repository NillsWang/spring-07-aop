package com.wmz.aop05;

public interface ISomeService {
	
	boolean checkUser(String username, String password) throws UserException;
	
}
