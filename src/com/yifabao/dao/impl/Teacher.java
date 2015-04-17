package com.yifabao.dao.impl;

import com.yifabao.dao.Person;

public class Teacher implements Person{

	@Override
	public String go() {
		String msg = "去教室讲课";
		System.out.println(msg);
		return msg;
	}

}
