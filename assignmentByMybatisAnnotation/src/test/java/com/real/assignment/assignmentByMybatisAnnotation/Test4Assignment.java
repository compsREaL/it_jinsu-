package com.real.assignment.assignmentByMybatisAnnotation;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.real.assignment.assignmentByMybatisAnnotation.bean.Student;
import com.real.assignment.assignmentByMybatisAnnotation.service.IStudentService;
import com.real.assignment.assignmentByMybatisAnnotation.service.StudentService;

public class Test4Assignment {

	private IStudentService service;

	@Before
	public void before() {
		service = new StudentService();
	}

	@Test //增
	public void testInsertStudent() {
		long time = new Date(2017, 11, 10).getTime();
		Student student = new Student("小学生", "444711061", "旺仔牛奶", time, "西安工程大学", "PM-867",
				"dailyType=others&total=8&page=8&uid=18209&sort=0&orderBy=3",
				"也许是年轻，但是年轻就要永不放弃！      一直喜欢的一句话上天让你成长，必让你身经百战。", "张新然", "知乎", new Date().getTime(),
				new Date().getTime());
		service.addStudent(student);
		System.out.println(student);
		service.close();
	}

	@Test
	public void testInsertStudentReturnId() {
		long time = new Date(2017, 11, 10).getTime();
		Student student = new Student("小学生", "444711061", "旺仔牛奶", time, "西安工程大学", "PM-867",
				"dailyType=others&total=8&page=8&uid=18209&sort=0&orderBy=3",
				"也许是年轻，但是年轻就要永不放弃！      一直喜欢的一句话上天让你成长，必让你身经百战。", "张新然", "知乎", new Date().getTime(),
				new Date().getTime());
		service.addStudentReturnId(student);
		System.out.println(student);
		service.close();
	}

	@Test //改
	public void testUpdateStudent() {
		long time = new Date(2015, 10, 18).getTime();
		Student student = new Student("秦羽", "444711061", "神王", time, "清华大学", "PM-867",
				"dailyType=others&total=8&page=8&uid=18209&sort=0&orderBy=3", "好好学习，天天向上！", "张新然", "知乎",
				new Date().getTime(), new Date().getTime());
		student.setId(5);
		service.updateStudent(student);
	}

	@Test //删
	public void testDeleteStudent() {
		service.removeStudentById(3);
	}

	@Test //查
	public void testSelectAllStudent() {
		List<Student> list = service.findAllStudent();
		for (Student student : list) {
			System.out.println(student);
		}
	}

	@Test
	public void testSelectStudentById() {
		Student student = service.findStudentById(5);
		System.out.println(student);
	}

	@Test
	public void testSelectStudentByName() {
		List<Student> list = service.findStudentByName("华");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
