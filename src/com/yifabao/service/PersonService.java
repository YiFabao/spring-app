package com.yifabao.service;

import com.yifabao.dao.PersonDao;

public class PersonService {

	private PersonDao personDao;
	
	public void init(){
		System.out.println("初始化方法被调用");
	}
	public PersonService() {
		super();
		System.out.println("我被实例化了");
	}

	public void save(){
		personDao.add();//调用注入的对象
	}
	
	public void destroy(){
		System.out.println("我被销毁了");
	}
	public PersonDao getPersonDao() {
		return personDao;
	}
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	
}
