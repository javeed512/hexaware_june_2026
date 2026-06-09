package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Hibernate");

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tr = session.beginTransaction();

	//	Employee emp = new Employee(101, "javeed", 30000);
		
		Employee emp =	   session.get(Employee.class, 101);
		
			System.out.println(emp);
			
			emp.setEname("javeed khan");
			emp.setSalary(90000);
			

		Serializable ser = session.save(emp);  // insert or update

		System.out.println(ser + "employee record effected");
		
		System.out.println(emp);
		
				session.delete(emp);
		
		

		tr.commit();

	}
}
