package com.nishant.demo;

import com.nishant.demo.DependencyInjection.OrderService;
import com.nishant.demo.Server.HelloServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);



//        HelloServer helloServer = context.getBean(HelloServer.class);
//		helloServer.hello();




//		OrderService orderservice = context.getBean(OrderService.class);
//		orderservice.placeOrder();

	//Holding the reference of student classs With the help of ApplicationContext

		/*

		Student student = context.getBean(Student.class);

		student.setName("Rahul");
		student.setAge(30);

		System.out.println(student.getName());
		System.out.println(student.getAge());

	------------Without holding the reference of the object---------------

		Student student = new Student("Nishxt",22);

		System.out.println(student.getName());
		System.out.println(student.getAge());


 */

	}
}
