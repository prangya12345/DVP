package com.example.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
//import com.example.model.EmployeeModel;

@RestController
@RequestMapping("/emp/111111")
public class DvpController {
	
	
	@GetMapping("/employees")
	public Employee getAllEmployees()
	{
		Employee e= new Employee();
		e.setId(1);
		e.setName("Prangya");
		e.setPassword("roor");
		return e;
	}
	
	@GetMapping("/getData")
	public String getData()
	{
		
		return "Hello";
	}
	
	@GetMapping("/emp")
	public ResponseEntity<Employee> getAllEmp()
	{
		Employee e= new Employee();
		e.setId(1);
		e.setName("sunny");
		e.setPassword("roor");
		return new ResponseEntity<>(e,HttpStatus.OK);
	}
	
	@GetMapping(value="/empXML")
	public ResponseEntity<Employee> getAllEmpXML()
	{
		Employee e= new Employee();
		e.setId(1);
		e.setName("sunny");
		e.setPassword("roor");
		return new ResponseEntity<>(e,HttpStatus.OK);
	}
	
	@GetMapping(value ="/pathVariableExample/{id}")
	public int getPathVariableExample(@PathVariable("id") Integer id)
	{
		return id;
	}
	
	@GetMapping("/requestParamExample")
	public int getrRequestParamExample(@PathVariable("id") Integer id)
	{
		return id;
	}
	
	
	
	
	
	

}
