package com.empl.pro.bo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Business object corresponding to Employee
 *
 */
public class EmployeeRequestBO implements Serializable {

	
	private static final long serialVersionUID = -4188405270393930490L;
	
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("last_name")
	private String lastName;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("number")
	private String number;

	/**
	 * 
	 */
	public EmployeeRequestBO() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param number
	 */
	public EmployeeRequestBO(String firstName, String lastName, String address, String number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.number = number;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
}
