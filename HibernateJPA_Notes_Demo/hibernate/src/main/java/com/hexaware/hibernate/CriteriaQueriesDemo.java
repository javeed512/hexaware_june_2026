package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hexaware.hibernate.entity.Employee;

public class CriteriaQueriesDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Criteria cr = session.createCriteria(Employee.class);

		List<Employee> list = cr.list();

		list.forEach(System.out::println);

		cr.add(Restrictions.between("salary", 3000.0, 50000.0));

		cr.list().forEach(System.out::println);

		cr.add(Restrictions.gt("salary", 30000.0));
		cr.addOrder(Order.asc("ename"));

		System.out.println(cr.list());
		
		
		Criteria cr2 = session.createCriteria(Employee.class);

		cr2.setProjection(Projections.rowCount());

		System.out.println(cr2.list());

		cr2.setProjection(Projections.max("salary"));

		System.out.println(cr2.list());

	}

}
