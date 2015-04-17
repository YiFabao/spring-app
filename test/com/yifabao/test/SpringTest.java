package com.yifabao.test;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yifabao.service.PersonService;

public class SpringTest extends TestCase{
	
	public void testInstanceSpring(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		PersonService personService = (PersonService) ctx.getBean("personService");
		personService.save();
	}
}
