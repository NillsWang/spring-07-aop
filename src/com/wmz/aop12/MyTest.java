package com.wmz.aop12;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
	
	@Test
	public void test01() {
		//从类路径中找xml文件，这里的配置文件存放在src下
		//加载spring配置文件，创建spring容器对象
		String resource = "/com/wmz/aop12/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doFirst();
		System.out.println("-------------------");
		service.doSecond();
		System.out.println("-------------------");
		service.doThird();
		
		System.out.println("----------------------------------");
		
		ISomeService service2 = (ISomeService) ac.getBean("someService2");
		service2.doFirst();
		System.out.println("-------------------");
		service2.doSecond();
		System.out.println("-------------------");
		service2.doThird();
			
	}
	
}
