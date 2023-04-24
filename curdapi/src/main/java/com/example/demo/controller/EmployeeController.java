package com.example.demo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController // encapsulates @ResponseBody and @Controller Annotation
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/api/employees")
	public List<Employee> getEmployee(){
		
		return empService.getEmployees();
		
		
	}
	
	@GetMapping("/api/employees/{empID}")
	public List<Employee> getEmployeeByID(@PathVariable String empId){
		
		return empService.getEmployees();
		
		
	}
	
	@GetMapping("/api/employees/empId={empId}")
	public List<Employee> getEmployeeByID2(@RequestParam String empId){
		
		return empService.getEmployees();
		
		
	}
	
	@PostMapping("/api/v1/add-employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		
		empService.saveEmployee(emp);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping("api/v1/findEmployee/{empID}")
	public Employee searchEmployeeById(@PathVariable String empId) {
		return empService.getOneEmployee(Integer.valueOf(empId));
	}
	
	
	@PostMapping("/api/addEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		empService.saveEmployee(employee);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
		
	}

}
