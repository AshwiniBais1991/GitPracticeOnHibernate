package com.curd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeDetail")
public class Employee {
	@Column(name = "Employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	@Column(name = "Employee_Name")
	private String name;
	@Column(name = "Employee_City")
	private String city;

	public Employee(String name, String city, String emailId) {

		this.name = name;
		this.city = city;
		this.emailId = emailId;
	}

	@Column(name = "Employee_email-id")
	private String emailId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
