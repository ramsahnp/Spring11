package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;
import com.service.StudentService;

public class Client {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("resource/datasource.xml");
		
		StudentService sts=(StudentService) cac.getBean("service");
		int row=sts.save(new Student(1,"ABC","a@gmail.com","ktm"));
		System.out.println("SAved Successfully !!!!!");
		 cac.close();

	}

}
