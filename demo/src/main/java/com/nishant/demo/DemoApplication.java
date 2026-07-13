package com.nishant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//Holding the reference of student classs With the help of ApplicationContext

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Student student = context.getBean(Student.class);

		student.setName("Rahul");
		student.setAge(30);

		System.out.println(student.getName());
		System.out.println(student.getAge());

/*

	------------Without holding the reference of the object---------------

		Student student = new Student("Nishxt",22);

		System.out.println(student.getName());
		System.out.println(student.getAge());


 */
	}

}
