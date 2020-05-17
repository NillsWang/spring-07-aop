package com.wmz.aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//环绕通知
//可以获取到目标方法的返回值，也可以修改返回值
public class MyMethodIntercepter implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行环绕通知，目标方法执行之前");
		//执行目标方法
		Object result = invocation.proceed();
		if(result != null) {
			return ((String)result).toUpperCase();
		}
		System.out.println("执行环绕通知，目标方法执行之后");
		return null;
	}

}
