package com.db;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DBDataHarness{

	public List prepare( List<String> mapperArray) {
		String resource = "db/connection/mybatis-config.xml";
		InputStream inputStream = null;
		List orderContainerList =new ArrayList();
		List allOrderContainerList =new ArrayList();
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		for(String mapper : mapperArray){
			SqlSession session = sqlSessionFactory.openSession();
			try {
				orderContainerList = session.selectList(mapper);
				
			} finally {
				session.close();
			}
			allOrderContainerList.addAll(orderContainerList);
		}
		
		return allOrderContainerList;
	}

}
