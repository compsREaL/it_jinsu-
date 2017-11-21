package com.real.assignment.assignmentByJdbcTemplate.dao;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.real.assignment.assignmentByJdbcTemplate.bean.Student;

public class StudentDao extends JdbcDaoSupport implements IStudentDao {

	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into assignment(name,qq,occupation,enrolltime,graduatefrom,snumber,reportlink,desire,seniorname,realizefrom,create_at,update_at) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
		this.getJdbcTemplate().update(sql, student.getName(),student.getQq(),student.getOccupation(),student.getEnrolltime(),
				student.getGraduatefrom(),student.getSnumber(),student.getReportlink(),student.getDesire(),student.getSeniorname(),
				student.getRealizefrom(),new Date().getTime(),new Date().getTime());
		
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "update assignment set name=?,qq=?,occupation=?,enrolltime=?,graduatefrom=?,snumber=?,reportlink=?,"
		                      + "desire=?,seniorname=?,realizefrom=?,update_at=? where id=?";
		this.getJdbcTemplate().update(sql, student.getName(),student.getQq(),student.getOccupation(),student.getEnrolltime(),
				student.getGraduatefrom(),student.getSnumber(),student.getReportlink(),student.getDesire(),student.getSeniorname(),
				student.getRealizefrom(),new Date().getTime(),student.getId());
	}

	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		String sql="delete from assignment where id=?";
		this.getJdbcTemplate().update(sql, id);
	}

	public List<Student> selectAllStudent() {
		// TODO Auto-generated method stub
		String sql="select * from assignment";
		return this.getJdbcTemplate().query(sql, new StudentRowMapper());
	}

	public Student selectStudentById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from assignment where id=?";
		return this.getJdbcTemplate().queryForObject(sql, new StudentRowMapper(), id);
	}

	public List<Student> selectStudentByName(String name) {
		// TODO Auto-generated method stub
		String sql = "select * from assignment where name like '%' ? '%'";
		return this.getJdbcTemplate().query(sql, new StudentRowMapper(), name);
	}

}
