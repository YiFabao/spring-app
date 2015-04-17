package com.yifabao.beanfactory;

import com.yifabao.service.PersonService;

/**
 * 静态bean工厂
 * @author yifabao
 *
 */
public class PersonServiceBeanFactory {


	public static PersonService createPersonServiceBean(){
		return new PersonService();
	}
	
	public PersonService createPersonServiceBean2(){
		return new PersonService();
	}
}
