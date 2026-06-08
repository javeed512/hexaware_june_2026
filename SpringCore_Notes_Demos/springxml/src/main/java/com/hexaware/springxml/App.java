package com.hexaware.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexaware.springxml.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        	ApplicationContext context =			new  ClassPathXmlApplicationContext("application.xml");
        
        	
        	Employee emp = (Employee)			context.getBean("emp");
        	
        			System.out.println(emp);
        			
        			System.out.println(emp.getEid() +" "+emp.getEname());
        			
        			System.out.println(emp.getAddress());
        			
        			System.out.println(emp.getAddress().getCity());
        
    }
}
