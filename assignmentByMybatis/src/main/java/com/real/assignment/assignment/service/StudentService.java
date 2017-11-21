package com.real.assignment.assignment.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.real.assignment.assignment.bean.Student;
import com.real.assignment.assignment.dao.IStudentDao;
import com.real.assignment.assignment.utils.MybatisUtil;

public class StudentService implements IStudentService {

	private SqlSession session = MybatisUtil.getSqlSession();
	private IStudentDao dao = session.getMapper(IStudentDao.class);

	public void addStudent(Student student) {
		dao.insertStudent(student);
		session.commit();
	}

	public void updateStudent(Student student) {
		dao.updateStudent(student);
		session.commit();
	}

	public void removeStudentById(int id) {
		dao.deleteStudentById(id);
		session.commit();
	}

	public List<Student> findAllStudent() {
		return dao.selectAllStudent();
	}

	public Student findStudentById(int id) {

		return dao.selectStudentById(id);
	}

	public List<Student> findStudentByName(String name) {
		return dao.selectStudentByName(name);
	}

	public void close() {
		if (session != null) {
			session.close();
		}
	}
}
