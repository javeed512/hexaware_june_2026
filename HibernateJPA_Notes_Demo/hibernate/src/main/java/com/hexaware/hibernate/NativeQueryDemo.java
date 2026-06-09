package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.hexaware.hibernate.entity.Employee;

public class NativeQueryDemo {

	public static void main(String[] args) {

		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
			NativeQuery<Employee>  query =		session.createNativeQuery("select * from Emp_Table",Employee.class);
	
			List<Employee>  list =	query.getResultList();
			
				list.forEach(System.out::println);
			
			
	}

}
