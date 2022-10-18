package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContent {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("employees.xml");
		System.out.println("Application Context Started");
		
		Employee e1 = (Employee) ac.getBean("emp1");
		System.out.println(e1);
		
	}

}
