package com.real.assignment.assignmentBySpringMybatis;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.real.assignment.assignmentBySpringMybatis.bean.Student;
import com.real.assignment.assignmentBySpringMybatis.service.IStudentService;

public class Test4SpringMybatis {
	
	private ApplicationContext applicationContext;
	private IStudentService service;
	
	@Before
	public void before(){
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = (IStudentService) applicationContext.getBean("studentService");
	}
	
	@Test
	public void testFindAllStudent(){
		List<Student> list = service.findAllStudent();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testAddStudent(){
		long time = new Date(2017,11,10).getTime();
		Student student = new Student("xiaoxuesheng","444711061","java架构师",time,"西安工程大学","PM-867","dailyType=others&total=8&page=8&uid=18209&sort=0&orderBy=3","也许是年轻，但是年轻就要永不放弃！      一直喜欢的一句话上天让你成长，必让你身经百战。","张新然","知乎",new Date().getTime(),new Date().getTime());
		service.addStudent(student);
		System.out.println(student);
	}
	
	@After
	public void after(){
		if (applicationContext != null) {
			((ClassPathXmlApplicationContext)applicationContext).close();
		}
	}
}
