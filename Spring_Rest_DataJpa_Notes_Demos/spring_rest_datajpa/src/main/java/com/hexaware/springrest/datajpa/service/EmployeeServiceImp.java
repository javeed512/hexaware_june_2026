package com.hexaware.springrest.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrest.datajpa.EmployeeDTO;
import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp   implements  IEmployeeService{

	
		@Autowired
		EmployeeRepository repo;
	
	
	@Override
	public Employee addEmployee(EmployeeDTO dto) {

		Employee  emp = new Employee();
		
		emp.setEid(dto.getEid());
		emp.setEname(dto.getEname());
		emp.setSalary(dto.getSalary());
		
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(EmployeeDTO dto) {
		
		
		
		Employee  emp = new Employee();
		
		emp.setEid(dto.getEid());
		emp.setEname(dto.getEname());
		emp.setSalary(dto.getSalary());
		
		return repo.save(emp);
	}

	@Override
	public EmployeeDTO getByEid(int eid) {


		Employee emp = repo.findById(eid).orElse(null);
		
		
			EmployeeDTO dto = new EmployeeDTO();
					dto.setEid(emp.getEid());
					dto.setEname(emp.getEname());
					dto.setSalary(emp.getSalary());
					
					
			return dto;		
		
	}

	@Override
	public void deleteByEid(int eid) {

				repo.deleteById(eid);
		
	}

	@Override
	public List<Employee> getAllEmployees() {


		
		return repo.findAll();
	}

}
