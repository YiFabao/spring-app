package com.yifabao.test;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yifabao.beanfactory.FabaoClassPathXmlApplicationContext;
import com.yifabao.dao.impl.Student;
import com.yifabao.service.PersonService;

public class SpringTest extends TestCase{
	
/*	public void testInstanceSpring(){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		PersonService personService = (PersonService) ctx.getBean("personService");
		PersonService personService2 = (PersonService) ctx.getBean("personService");
		personService.save();
		System.out.println(personService);
		System.out.println(personService2);
		if(personService==personService2){
			System.out.println("单实例");
		}
		assertEquals(personService, personService2);
	}
	public void testInstanceSpring2(){
		
		FabaoClassPathXmlApplicationContext ctx = new FabaoClassPathXmlApplicationContext("beans1.xml");
		//Student studnet = (Student) ctx.getBean("student");
		//studnet.go();
	}*/
	
	/*
	public void testInstanceSpring3(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		PersonService personService = (PersonService) ctx.getBean("personService2");
		personService.save();
	}
	public void testInstanceSpring4(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		PersonService personService = (PersonService) ctx.getBean("personService3");
		personService.save();
	}*/
	
/*	public void testInstanceSpring5(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		PersonService personService = (PersonService) ctx.getBean("personService");
		personService.save();
		((AbstractApplicationContext)ctx).close();;
	}*/
	
public void testInstanceSpring6(){
		
		FabaoClassPathXmlApplicationContext ctx = new FabaoClassPathXmlApplicationContext("beans1.xml");
		PersonService personService = (PersonService) ctx.getBean("personService");
		personService.save();
		
	}
	
	
}
