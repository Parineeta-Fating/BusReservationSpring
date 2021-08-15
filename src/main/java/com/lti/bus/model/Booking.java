

package com.lti.bus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {


	@Id
	@Column(name ="booking_id" )
	private String bookingId;
	
	@Column(name ="Date_Of_Travel" )
	private Date DateOfTravel;
	
	@Column(name ="Bus_Id" )
	private String busId;
	
	@Column(name ="Feedback_Id" )
	private String feedbackId;
	
	@Column(name ="No_Of_Tickets" )
	private int noOfTickets;
	
	@Column(name ="Email_Id" )
	private String emailId;
	
	@Column(name ="Phone_No" )
	private String phoneNo;
	
	@Column(name ="Date_Of_Booking" )
	private Date dateOfBooking;
	
	@Column(name ="Status" )
	private String status;
	
	
	public Booking(String bookingId, Date dateOfTravek, String busId, String feedbackId, int noOfTickets,
			String emailId, String phoneNo, Date dateOfBooking, String status) {
		super();
		this.bookingId = bookingId;
		this.DateOfTravel = DateOfTravel;
		this.busId = busId;
		this.feedbackId = feedbackId;
		this.noOfTickets = noOfTickets;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.dateOfBooking = dateOfBooking;
		this.status = status;
	}
	
	
	public Booking() {
		super();
	}
	
	
	
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public Date getDateOfTravek() {
		return DateOfTravel;
	}
	public void setDateOfTravek(Date dateOfTravel) {
		DateOfTravel = dateOfTravel;
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	


}