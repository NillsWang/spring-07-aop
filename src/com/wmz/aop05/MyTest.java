package com.wmz.aop05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		//从类路径中找xml文件，这里的配置文件存放在src下
		//加载spring配置文件，创建spring容器对象
		String resource = "/com/wmz/aop05/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("serviceProxy");
		try {
			service.checkUser("wmz", "123");
			System.out.println("登陆成功");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//service.checkUser("wm", "123"); //用户名错误异常
		//service.checkUser("wmz", "12"); //密码错误异常
			
	}
	
}
