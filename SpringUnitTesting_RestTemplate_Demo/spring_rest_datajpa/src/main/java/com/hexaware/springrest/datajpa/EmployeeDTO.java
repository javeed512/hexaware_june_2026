package com.hexaware.springrest.datajpa;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Component
public class EmployeeDTO {

	
	
	@Min(100)
	@Max(199)
	private int eid;
	
	@NotNull
	@NotEmpty
	@Pattern(regexp = "[A-Z][a-z]{3,10}")
	private String ename ;
	
	@Min(5000)
	private double salary;
	
	/*
	 * @Email private String email;
	 */
	
	
	
	public EmployeeDTO() {
		
		
	}
	
	
	public EmployeeDTO(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	
}
