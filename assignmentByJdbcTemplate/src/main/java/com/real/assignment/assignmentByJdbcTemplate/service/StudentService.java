package com.real.assignment.assignmentByJdbcTemplate.service;

import java.util.List;

import com.real.assignment.assignmentByJdbcTemplate.bean.Student;
import com.real.assignment.assignmentByJdbcTemplate.dao.IStudentDao;

public class StudentService implements IStudentService {

	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.insertStudent(student);
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.updateStudent(student);
	}

	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		dao.deleteStudentById(id);
	}

	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return dao.selectAllStudent();
	}

	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.selectStudentById(id);
	}

	public List<Student> findStudentByName(String name) {
		// TODO Auto-generated method stub
		return dao.selectStudentByName(name);
	}

}
