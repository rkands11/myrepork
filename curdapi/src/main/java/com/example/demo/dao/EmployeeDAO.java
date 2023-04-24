package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployees();

	public Employee getOneEmployee(int id);

	public void saveEmployee(Employee employee);

	public void deleteEmployee();

}
