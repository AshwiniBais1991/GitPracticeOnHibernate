package com.curd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeDetail")
public class Employee {
	@Column(name = "Employee_id")
	private int employeeId;
	@Column(name = "Employee_Name")
	private String name;
	@Column(name = "Employee_City")
	private String city;
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
