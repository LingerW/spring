package com.linger;

import com.linger.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class debug {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}
}
