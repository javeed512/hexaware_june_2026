package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.hibernate.entity.Employee;

public class EmployeeDAO {

	public List<Employee> getAllEmployees() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		
			Query<Employee>   query =	session.createNamedQuery("getAllEmployees");
			
						query.setParameter(1, 5000.0);
						
					List<Employee>  list =	query.getResultList();
					
					
			
				return 		list;

	}
	
	
		public double   getTotal() {
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			Session session = sessionFactory.openSession();
			
			
				Query<Double>   query =	session.createNamedQuery("getTotal");
				
					Double  total =	query.getSingleResult();
					
					
					
				return total;
			
			
			
		}
	
	
		public static void main(String[] args) {
			
			
			
				   EmployeeDAO  dao = new EmployeeDAO();
				   
				   	dao.getAllEmployees().forEach(System.out::println);
				   	
				   	
				double total =   	dao.getTotal();
				
				System.out.println("Sum of salaries "+total);
			
			
		}
	
	
	

}
