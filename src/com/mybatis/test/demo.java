package com.mybatis.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.mapper.UserMapper;
import com.mybatis.model.Person;



public class demo {

	public static void main(String[] args) throws IOException {

		Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);    // 创建 SqlSessionFactory
		SqlSession sqlSession = sqlSessionFactory.openSession();   // 获取到 SqlSession

        
        //新增一筆資料
//        Person person = new Person();
//        person.setName("新增資料");
//        person.setAge(500);
//        
//	    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//	    userMapper.insert(person);
//	    sqlSession.commit();
//	    System.out.println("插入成功數據ID為：" + person.getId());
	        
        //修改一筆資料
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        Person person = userMapper.selectPersonByID(7);
//        if (person != null){
//        	person.setName("修改成功");
//        	userMapper.update(person);
//        	sqlSession.commit();
//        }
//        System.out.println( person.getId() + "-修改數據成功");
        
        //刪除一筆資料
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		userMapper.delete(8);
//        sqlSession.commit();
//          
//        System.out.println( "刪除數據成功");
		
		//查詢Person List
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		List<Person> persons = userMapper.selectPersonsByName("新增");
//		for(Person person:persons){
//			System.out.println(person.getId() + ":" + person.getName()
//            + ":" + person.getAge());
//		}
		
		//查詢Person List(equals)
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		List<Person> persons = userMapper.selectPersonsByNameEquals("新增資料");
//		for(Person person:persons){
//			System.out.println(person.getId() + ":" + person.getName()
//		          + ":" + person.getAge());
//		}
        
        
	}

}
