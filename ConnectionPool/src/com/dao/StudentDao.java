package com.dao;

import com.model.Student;

public interface StudentDao 
{
	public int save(Student s);
	
	public int update(Student s);
	public int find(int id);
	public int findAll();

}
