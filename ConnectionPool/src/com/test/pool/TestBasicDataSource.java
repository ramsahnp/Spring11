package com.test.pool;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.Date;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestBasicDataSource {

	public static void main(String[] args) throws PropertyVetoException {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass("com.mysql.jdbc.Driver"); // loads the jdbc driver 
		cpds.setJdbcUrl("jdbc:mysql://localhost:3306/testdb?characterEncoding=latin1" );
		cpds.setUser("root"); 
		cpds.setPassword("@Wt&$567*"); 
		cpds.setMinPoolSize(5); 
		cpds.setAcquireIncrement(5);
		cpds.setMaxPoolSize(20);
		cpds.setMaxIdleTime(5);
		//cpds.setM
		
		
		Date d1=new Date();
		for(int i=0;i<2500000;i++) {
			try {
			Connection con=cpds.getConnection();
			con.close();
			System.out.println(con+" ==== "+i  );
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		Date d2=new Date();
		
		System.out.println("Start Time: "+d1);
		
		System.out.println("End Time: "+d2);
		
		
		
		
		

	}

}
