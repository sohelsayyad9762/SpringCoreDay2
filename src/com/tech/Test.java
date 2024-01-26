package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Student s1=(Student) ctx.getBean("ee1");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		
		Address a1=(Address) ctx.getBean("ee2");
		System.out.println(a1.getCity());
		System.out.println(a1.getPincode());
		
		
		
		

	}

}
