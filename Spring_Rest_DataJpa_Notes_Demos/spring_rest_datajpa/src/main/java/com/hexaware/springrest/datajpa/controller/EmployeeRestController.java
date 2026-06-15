package com.hexaware.springrest.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.datajpa.EmployeeDTO;
import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@PostMapping("/add")
	public Employee createEmployee(@RequestBody EmployeeDTO dto) {

		return service.addEmployee(dto);

	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody EmployeeDTO dto) {

		return service.updateEmployee(dto);

	}

	@GetMapping("/getbyeid/{eid}")
	public EmployeeDTO getEmployeeByEid(@PathVariable int eid) {

		return service.getByEid(eid);

	}
	
	
	@GetMapping("/getall")
	public List<Employee>  getAll(){
		
		
			return service.getAllEmployees();
		
	}
	
	
	@DeleteMapping("/deletebyeid/{eid}")
	public   ResponseEntity<String>   deleteByEid( @PathVariable  int eid){
		
			
				service.deleteByEid(eid);
		
				return  new  ResponseEntity<String>("Record Deleted successfully", HttpStatus.ACCEPTED);
		
		
	}
	
	
	
	
	

}
