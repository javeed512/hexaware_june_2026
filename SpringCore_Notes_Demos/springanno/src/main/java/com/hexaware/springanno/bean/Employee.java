package com.hexaware.springanno.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp1")
@Scope("prototype")
public class Employee { // pojo or Bean

	private int eid;
	private String ename;
	private double salary;

	@Autowired	
	private Address address;

	public Employee() {

	}

	public Employee(int eid, String ename, double salary, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
