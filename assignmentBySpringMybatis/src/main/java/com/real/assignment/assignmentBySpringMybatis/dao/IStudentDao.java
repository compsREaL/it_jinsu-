package com.real.assignment.assignmentBySpringMybatis.dao;

import java.util.List;

import com.real.assignment.assignmentBySpringMybatis.bean.Student;


public interface IStudentDao {

	void insertStudent(Student student);
	void updateStudent(Student student);
	void deleteStudentById(int id);
	
	List<Student> selectAllStudent();
	Student selectStudentById(int id);
	List<Student> selectStudentByName(String name);
}
