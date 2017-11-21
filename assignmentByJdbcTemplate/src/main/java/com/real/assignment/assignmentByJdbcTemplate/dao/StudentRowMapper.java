package com.real.assignment.assignmentByJdbcTemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.real.assignment.assignmentByJdbcTemplate.bean.Student;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setQq(rs.getString("qq"));
		student.setOccupation(rs.getString("occupation"));
		student.setEnrolltime(rs.getLong("enrolltime"));
		student.setGraduatefrom(rs.getString("graduatefrom"));
		student.setSnumber(rs.getString("snumber"));
		student.setDesire(rs.getString("desire"));
		student.setReportlink(rs.getString("reportlink"));
		student.setSeniorname(rs.getString("seniorname"));
		student.setRealizefrom(rs.getString("realizefrom"));
		student.setCreate_at(rs.getLong("create_at"));
		student.setUpdate_at(rs.getLong("update_at"));
		return student;
	}

}
