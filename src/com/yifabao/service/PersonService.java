package com.yifabao.service;

public class PersonService {
	
	public void init(){
		System.out.println("初始化方法被调用");
	}
	public PersonService() {
		super();
		System.out.println("我被实例化了");
	}

	public void save(){
		System.out.println("保存");
	}
	
	public void destroy(){
		System.out.println("我被销毁了");
	}
}
