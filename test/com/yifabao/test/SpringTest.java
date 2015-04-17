package com.yifabao.test;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yifabao.beanfactory.FabaoClassPathXmlApplicationContext;
import com.yifabao.dao.impl.Student;
import com.yifabao.service.PersonService;

public class SpringTest extends TestCase{
	
	public void testInstanceSpring(){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		PersonService personService = (PersonService) ctx.getBean("personService");
		personService.save();
	}
	public void testInstanceSpring2(){
		
		FabaoClassPathXmlApplicationContext ctx = new FabaoClassPathXmlApplicationContext("beans1.xml");
		Student studnet = (Student) ctx.getBean("student");
		studnet.go();

	
	}
}
