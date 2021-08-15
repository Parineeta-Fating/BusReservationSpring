

package com.lti.bus.model;

import javax.persistence.*;

@Entity
public class Passenger {

	@Id
	@Column(name = "Passenger_id")
	private String passengerId;
	@Column(name = "Passenger_name")
	private String passengerName;
	@Column(name = "Pass_Age")
	private int passAge;
	@Column(name = "Pass_Gender")
	private String gender;
	@Column(name = "Booking_id")
	private String bookingId;
	@Column(name = "Bus_id")
	private String busId;
	@Column(name = "Seat_id")
	private String seatId;

	public Passenger() {
		super();
	}

	public Passenger(String passengerId, String passengerName, int passAge, String gender, String bookingId,
			String busId, String seatId) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passAge = passAge;
		this.gender = gender;
		this.bookingId = bookingId;
		this.busId = busId;
		this.seatId = seatId;
	}

	public String getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassAge() {
		return passAge;
	}

	public void setPassAge(int passAge) {
		this.passAge = passAge;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}