package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.dao.StudentDao;
import com.model.Student;

public class StudentDaoImp implements StudentDao {

	private DataSource ds1;
	
	

	public DataSource getDs1() {
		return ds1;
	}

	public void setDs1(DataSource ds1) {
		this.ds1 = ds1;
	}

	Connection con=null;
	@Override
	public int save(Student s) {
		
		try {
		con=ds1.getConnection();
		
		System.out.println("con====="+con);
		
		// do save operation.... either by jdbc or by hibernate or by ibatis or spring-jdbc
		
		PreparedStatement pstat=con.prepareStatement("insert into Student values(?,?,?,?)");
		pstat.setInt(1, s.getId());
		pstat.setString(2, s.getName());
		pstat.setString(3, s.getEmail());
		pstat.setString(4, s.getAddress());
		
		int row=pstat.executeUpdate();
		
		System.out.println("Row Affected: "+row);
		}catch(Exception e) {
			
		}
		
		return 0;
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
