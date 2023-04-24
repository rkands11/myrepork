package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO empDao;
	
	

	@Override
	@Transactional
	public List<Employee> getEmployees() {

		return empDao.getEmployees();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {

		empDao.saveEmployee(employee);

	}

	@Override
	@Transactional
	public void deleteEmployee() {
		empDao.deleteEmployee();
	}

	@Override
	@Transactional
	public Employee getOneEmployee(int id) {

		return empDao.getOneEmployee(id);
	}

}
