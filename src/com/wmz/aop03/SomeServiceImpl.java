package com.wmz.aop03;

public class SomeServiceImpl implements ISomeService {
	
	@Override
	public String doFirst() {
		// TODO Auto-generated method stub
		System.out.println("执行主业务逻辑doFirst()");
		return "abcde";

	}

	@Override
	public void doSecond() {
		// TODO Auto-generated method stub
		System.out.println("执行主业务逻辑doSecond()");

	}

}
