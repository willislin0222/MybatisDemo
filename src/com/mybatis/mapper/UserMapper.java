package com.mybatis.mapper;

import java.util.List;

import com.mybatis.model.Person;

public interface UserMapper {
	
	public Person selectPersonByID(int id);
	public int insert(Person person);
	public void update(Person person);
	public void delete(int id);
	public List<Person> selectPersonsByName(String name);
	public List<Person> selectPersonsByNameEquals(String name);
}
