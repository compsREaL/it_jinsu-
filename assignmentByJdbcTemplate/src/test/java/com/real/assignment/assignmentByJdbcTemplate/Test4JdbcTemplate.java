package com.real.assignment.assignmentByJdbcTemplate;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.real.assignment.assignmentByJdbcTemplate.bean.Student;
import com.real.assignment.assignmentByJdbcTemplate.service.IStudentService;
import com.real.assignment.assignmentByJdbcTemplate.service.StudentService;

public class Test4JdbcTemplate {

	private IStudentService service;
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Before
	public void before(){
		service = (StudentService) applicationContext.getBean("studentService");
	}
	
	@Test
	public void testAddStudent(){
		long time = new Date(2017,11,10).getTime();
		Student student = new Student("扫地僧","444711061","java架构师",time,"西安工程大学","PM-867","dailyType=others&total=8&page=8&uid=18209&sort=0&orderBy=3","也许是年轻，但是年轻就要永不放弃！      一直喜欢的一句话上天让你成长，必让你身经百战。","张新然","知乎",new Date().getTime(),new Date().getTime());
		for (int i = 0; i < 1000; i++) {
			
			service.addStudent(student);
		}
	}
	
	@Test
	public void testUpdateStudent(){
		long time = new Date(2016,10,18).getTime();
		Student student = new Student("学霸","444711061","校长",time,"帝国大学","PM-867","dailyType=others&total=8&page=8&uid=18209&sort=0&orderBy=3","好好学习，天天向上！","张新然","知乎",new Date().getTime(),new Date().getTime());
		student.setId(7);
		service.updateStudent(student);
	}
	
	@Test
	public void testRemoveStudentById(){
		service.removeStudent(8);
	}
	@Test
	public void testFindAllStudent(){
		List<Student> list = service.findAllStudent();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindStudentById(){
		Student student = service.findStudentById(5);
		System.out.println(student);
	}
	
	@Test
	public void testFindStudentByName(){
		List<Student> list = service.findStudentByName("华");
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	@After
	public void after(){
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
	
}
