package com.shopdemo.springbootstart.costumer;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	
	//fields
	@Id
	private String customerId;
	private String firstName;
	private String lastName;
	private int bonusPoints;
	private Date dateOfBirth;
	
	
	
	
	//Constructor
	public Customer(String customerId, String firstName, String lastName, int bonusPoints, Date dateOfBirth) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bonusPoints = bonusPoints;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Customer() {
	}
	
	
	//Getters and Setters
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	public int getBonusPoints() {
		return bonusPoints;
	}
	public void setBonusPoints(int bonusPoints) {
		this.bonusPoints = bonusPoints;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	

}
