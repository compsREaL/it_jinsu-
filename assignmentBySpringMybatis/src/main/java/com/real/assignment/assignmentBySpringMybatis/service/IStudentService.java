package com.real.assignment.assignmentBySpringMybatis.service;

import java.util.List;

import com.real.assignment.assignmentBySpringMybatis.bean.Student;


public interface IStudentService {

	void addStudent(Student student);
	void updateStudent(Student student);
	void removeStudent(int id);
	
	List<Student> findAllStudent();
	Student findStudentById(int id);
	List<Student> findStudentByName(String name);
}
