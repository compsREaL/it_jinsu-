package com.real.assignment.assignment.service;

import java.util.List;

import com.real.assignment.assignment.bean.Student;

public interface IStudentService {

	void addStudent(Student student);
	void updateStudent(Student student);
	void removeStudentById(int id);
	
	List<Student> findAllStudent();
	Student findStudentById(int id);
	List<Student> findStudentByName(String name);
	
	public void close();
}
