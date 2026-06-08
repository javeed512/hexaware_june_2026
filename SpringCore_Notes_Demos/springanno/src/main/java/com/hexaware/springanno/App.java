package com.hexaware.springanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.hexaware.springanno.bean.Address;
import com.hexaware.springanno.bean.Employee;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScans(value = { @ComponentScan(basePackages = "com.hexaware.springanno.*") })
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		Address a1 = context.getBean(Address.class);

		a1.setCity("Hyderabad");

		System.out.println(a1);

		System.out.println(a1.getCity());

		Employee e1 = context.getBean(Employee.class);

		e1.setEid(101);
		e1.setEname("king");
		e1.setSalary(80000);
		// e1.setAddress(a1);

		System.out.println(e1);
		System.out.println(e1.getEname());

		System.out.println(e1.getSalary());

		System.out.println(e1.getAddress());

		Employee emp1 = context.getBean("emp1", Employee.class);

		System.out.println(emp1);
		
		Thread t1 =	context.getBean("tr1", Thread.class);
			System.out.println(t1);
			
			Thread t2 =	context.getBean( Thread.class);
			System.out.println(t2);
		

	}
	
	
	
	@Bean("tr1")
	@Scope("prototype")
	public Thread   getThreadObj() {
		
		
		return  new Thread();
		
	}
	
	
	
	
	
	
	
	
	
}
