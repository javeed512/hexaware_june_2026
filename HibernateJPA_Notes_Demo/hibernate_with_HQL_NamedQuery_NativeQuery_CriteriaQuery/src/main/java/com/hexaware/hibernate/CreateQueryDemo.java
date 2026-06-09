package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

public class CreateQueryDemo {

	public static void main(String[] args) {


		SessionFactory  sessionFactory =		HibernateUtil.getSessionFactory();
		
		
					Session session =		sessionFactory.openSession();
					
					//HQL
					
		String selectQuery = "select  e   from  Employee e  where e.ename = ?1 and e.salary = :sal";
						
			
					Query<Employee> query =  		session.createQuery(selectQuery);
					
							query.setParameter(1, "king");
							query.setParameter("sal", 80000.0);
					
					
					Employee emp =	query.getSingleResult();
					
					System.out.println(emp);
					
					
					
				String selectAll = "select e from Employee e ";		
									
					
				Query<Employee> query2 = 		session.createQuery(selectAll);
				
				
				List<Employee>  list =		query2.getResultList();
				
				
				list.forEach(System.out::println);
				
				
			Transaction tr =	session.beginTransaction();
				
				
				Query query3 =		session.createQuery("delete from Employee e  where e.ename = ?1");
				
								query3.setParameter(1, "ford");
							
					int count =	query3.executeUpdate();
					
					tr.commit();
								
					System.out.println(count + " record effected..");
								
	}

}
