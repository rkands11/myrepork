package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeRepo;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	
	@Autowired
	EmployeeRepo repo;

	@Override
	public List<Employee> getEmployees() {

		
		
	return	(List<Employee>) repo.findAll();
		/*
		 * Session thisSession = entManager.unwrap(Session.class);
		 * 
		 * Query<Employee> query = thisSession.createQuery("from Employee",
		 * Employee.class);
		 * 
		 * System.out.println("Emp List--" + query.getResultList() );
		 * 
		 * return query.getResultList();
		 */
	}

	@Override
	public Employee getOneEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployee(Employee employee) {
		
		repo.save(employee);
		
		/*
		 * Session thisSession = entManager.unwrap(Session.class);
		 * thisSession.save(employee);
		 */

	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub

	}

}
