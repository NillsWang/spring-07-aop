package com.wmz.aop02;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//后置通知
//后置通知：可以获取到目标方法的返回值但不能修改
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	//在目标方法执行之前执行
	//	method：		  目标方法
	//	args：    		  目标方法的参数列表
	//	target：		  目标对象
	//	returnValue：目标方法的返回值
	@Override
	public void afterReturning(Object returnValue, 
			Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行后置通知方法");
		if(returnValue != null) {
			System.out.println("修改后" + ((String) returnValue).toUpperCase());
		}
	}

}
