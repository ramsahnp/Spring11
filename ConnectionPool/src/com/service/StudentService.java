package com.service;

import com.model.Student;

public interface StudentService {

	public int save(Student s);

	public int update(Student s);

	public int find(int id);

	public int findAll();

	// write all features...

}
