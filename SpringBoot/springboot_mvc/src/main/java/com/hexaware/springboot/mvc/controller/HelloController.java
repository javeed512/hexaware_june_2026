package com.hexaware.springboot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot.mvc.model.Employee;

@Controller
@RequestMapping("/app")
public class HelloController {
	
			@Autowired
			Employee emp;
	
	
			@RequestMapping("/hello")
			@ResponseBody
			public String    sayHello(@RequestParam String name) {
				
				
				return "Welcome to SpringBoot controller "+name;
				
				
			}
	
			
			  @RequestMapping(value="/add" , method = RequestMethod.GET)
			  @ResponseBody
			  public String add(@RequestParam  String  a , @RequestParam String b) {
			  
				  
				int n1 =  Integer.parseInt(a);
				int n2 = Integer.parseInt(b);
			  
				  return  "Addition is : "+(n1+n2);
				  
			  
			  }
			 
			  @RequestMapping(value="/addEmp" , method=RequestMethod.POST)
			  @ResponseBody
			  public String  addEmp(@RequestParam  String eid,@RequestParam String ename , @RequestParam String salary) {
				  
				int eid1 =  	Integer.parseInt(eid);
				 double sal = Double.parseDouble(salary); 
				 
				 emp.setEid(eid1); emp.setEname(ename); emp.setSalary(sal);
				 
				 
				 
				  return "Employee Details inserted in DB  "+ emp;
				  
				  
			  }
			  
			  
			  
			  
			  
			  
			  
			  
	
	
	
	

}
