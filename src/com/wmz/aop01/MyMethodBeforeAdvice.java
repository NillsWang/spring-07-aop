package com.wmz.aop01;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//前置通知
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	//在目标方法执行之前执行
	//	method：目标方法
	//	args：    目标方法的参数列表
	//	target：目标对象
	@Override
	public void before(Method method, Object[] args, Object target) 
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行前置通知方法");
		
	}

}
