package com.wmz.aop09;

public class SomeServiceImpl implements ISomeService {
	
	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("执行主业务逻辑doFirst()");

	}

	@Override
	public void doSecond() {
		// TODO Auto-generated method stub
		System.out.println("执行主业务逻辑doSecond()");

	}

	@Override
	public void doThird() {
		// TODO Auto-generated method stub
		System.out.println("执行主业务逻辑doThird()");
		
	}

}
