package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
//@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  

public class Employee {

	
	@Id
	private Integer id;

	private String name;

	private String gender;

	private Date dob	;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getDob()=" + getDob()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Employee(Integer id, String name, String gender, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}

	public Employee() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
