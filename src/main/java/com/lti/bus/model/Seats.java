package com.lti.bus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Seats")
public class Seats {

	
	@Id
	@Column(name ="Seat_id" )
	private String seatId;
	
	@Column(name ="Bus_Id" )
	private String busId;
	
	@Column(name ="Availability" )
	private int availability;

	public Seats(String seatId, String busId, int availability) {
		super();
		this.seatId = seatId;
		this.busId = busId;
		this.availability = availability;
	}

	public Seats() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getBusId() {
		return busId;
	}
	
	
	public void setBusId(String busId) {
		this.busId = busId;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}
	
	
	

}