package com.real.assignment.assignmentByMybatisAnnotation.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	private  static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSession getSqlSession(){
		
		if(sqlSessionFactory == null){
			
			try {
				InputStream in = Resources.getResourceAsStream("mybatis.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return sqlSessionFactory.openSession();
	}
	
}
