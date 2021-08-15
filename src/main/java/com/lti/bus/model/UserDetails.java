

package com.lti.bus.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails 
{
	@Id
	@Column(name="User_Id")
	private String userId;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Mail_Id")
	private String mailId;
	@Column(name="Phone_Number")
	private String phoneNumber;
	@Column(name="Password")
	private String password;
	@Column(name="Wallet")
	private double wallet;
	@Column(name="Dob")
	private LocalDate dob;
	@Column(name="Address")
	private String address;
	@Column(name="Role")
	private String role;
	
	
	
	
	
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String userId, String firstName, String lastName, String mailId, String phoneNumber,
			String password, double wallet, LocalDate dob, String address, String role) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.wallet = wallet;
		this.dob = dob;
		this.address = address;
		this.role = role;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", mailId="
				+ mailId + ", phoneNumber=" + phoneNumber + ", password=" + password + ", wallet=" + wallet + ", dob="
				+ dob + ", address=" + address + ", role=" + role + "]";
	}
	
	
}