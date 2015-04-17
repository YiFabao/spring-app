package com.yifabao.test;

import junit.framework.TestCase;

import com.yifabao.dao.impl.Student;
import com.yifabao.dao.impl.Teacher;

public class MyTest1 extends TestCase{
	
	public void testTeacherMethod(){
		Teacher teacher = new Teacher();
		String msg = teacher.go();
		assertEquals(msg,"去教室讲课");
		
	}
	
	public void testStudentMethod(){
		Student student = new Student();
		String msg = student.go();
		assertEquals(msg, "去教室上课");
	}
}
