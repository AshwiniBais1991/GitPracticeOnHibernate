package com.spring.first;

public class Strudent {
	private int rollNo;
	private String firstName;
	private String lastName;
	private Address address;
	
	
	
	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public void getData() {
		System.out.println(rollNo+ firstName+lastName+address.getCity()+address.getCountry()+address.getState());
	}
	

}
