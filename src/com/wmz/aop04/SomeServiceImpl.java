package com.wmz.aop04;

public class SomeServiceImpl implements ISomeService {
	
	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("执行主业务逻辑doFirst()" + 3/0);

	}

	@Override
	public void doSecond() {
		// TODO Auto-generated method stub
		System.out.println("执行主业务逻辑doSecond()");

	}

}
