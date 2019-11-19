package com.test.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

public class TestDb {

	public static void main(String[] args) {
		
		
		try{  
			Date d1=new Date();
			for(int i=0;i<25000;i++) {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/testdb?characterEncoding=latin1","root","@Wt&$567*");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			
			System.out.println("Connection: ===>> "+con+" i== "+i);
			/*esultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));*/  
			con.close();  
			
			Date d2=new Date();
			
			
			System.out.println("Start Time: "+d1);
			System.out.println("Start Time: "+d2);
			
			}
			}catch(Exception e){ System.out.println(e);}  
		
			

	}

}
