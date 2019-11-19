package com.serviceImpl;

import com.dao.StudentDao;
import com.model.Student;
import com.service.StudentService;

public class StudentServiceImpl implements StudentService
{

	private StudentDao studentDao;
	
	@Override
	public int save(Student s) {
		
		return studentDao.save(s);
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public int update(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int find(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findAll() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
