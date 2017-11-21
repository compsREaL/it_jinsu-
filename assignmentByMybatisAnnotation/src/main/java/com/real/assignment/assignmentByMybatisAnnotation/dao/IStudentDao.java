package com.real.assignment.assignmentByMybatisAnnotation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.real.assignment.assignmentByMybatisAnnotation.bean.Student;

public interface IStudentDao {

	@Insert(value = "insert into assignment(name,qq,occupation,enrolltime,graduatefrom,snumber,reportlink,desire,seniorname,realizefrom,create_at,update_at)"
			+ "values(#{name},#{qq},#{occupation},#{enrolltime},#{graduatefrom},#{snumber},#{reportlink},#{desire},#{seniorname},#{realizefrom},#{create_at},#{update_at})")
	void insertStudent(Student student);

	@Insert(value="insert into assignment(name,qq,occupation,enrolltime,graduatefrom,snumber,reportlink,desire,seniorname,realizefrom,create_at,update_at)"
			+ "values(#{name},#{qq},#{occupation},#{enrolltime},#{graduatefrom},#{snumber},#{reportlink},#{desire},#{seniorname},#{realizefrom},#{create_at},#{update_at})")
	@SelectKey(statement="select @@identity",keyProperty="id",resultType=int.class,before=false)
	void insertStudentReturnId(Student student);
	
	@Update(value = "update assignment set name=#{name},qq=#{qq},occupation=#{occupation},enrolltime=#{enrolltime},"
			+ "graduatefrom=#{graduatefrom},snumber=#{snumber},reportlink=#{reportlink},"
			+ "desire=#{desire},seniorname=#{seniorname},realizefrom=#{realizefrom},update_at=#{update_at}"
			+ "where id=#{id}")
	void updateStudent(Student student);

	@Delete(value="delete from assignment where id=#{id}")
	void deleteStudentById(int id);

	@Select(value="select * from assignment")
	List<Student> selectAllStudent();

	@Select(value="select * from assignment where id=#{id}")
	Student selectStudentById(int id);

	@Select(value="select * from assignment where name like '%' #{name} '%'")
	List<Student> selectStudentByName(String name);
}
