package com.wmz.aop05;

import org.springframework.aop.ThrowsAdvice;

//异常通知
public class MyThrowsAdvice implements ThrowsAdvice {
	
	public void afterThrowing(UserNameException ex){
		System.out.println("用户名输错了！" + ex.getMessage());
	}
	
	public void afterThrowing(PasswordException ex){
		System.out.println("密码输错了！ = " + ex.getMessage());
	}

}
