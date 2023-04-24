package com.example.demo.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, Integer>{

}
