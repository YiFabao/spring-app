package com.yifabao.dao.impl;

import com.yifabao.dao.Person;

public class Student implements Person{

	@Override
	public String go() {
		String msg = "去教室上课";
		System.out.println(msg);
		return msg;
		
	}

}
