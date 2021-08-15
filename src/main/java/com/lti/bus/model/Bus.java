

package com.lti.bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name="BUS")
public class Bus {
	@Id
	@Column(name="BUS_ID")
	private String busid;
	@Column(name="BUS_NAME")
	private String busname;
	@Column(name="BUS_TYPE")
	private String bustype;
	@Column(name="DURATION_OF_TRAVEL")
	private int durationoftravel;
	@Column(name="ARRIVAL_TIME")
	private String arrivaltime;
	@Column(name="DEPARTURE_TIME")
	private String departuretime;
	@Column(name="AVAILABLE_SEATS")
	private int availableseats;
	@Column(name="TOTAL_SEATS")
	private int totalseats;
	@Column(name="FARE")
	private int fare;
	@Column(name="ROUTE_ID")
	private String routeid;
	@Column(name="DISTANCE")
	private int distance;
	@Column(name="DEPARTURE_DATE")
	private Date departuredate;
	@Column(name="ARRIVAL_DATE")
	private Date arrivaldate;
	public String getBusid() {
		return busid;
	}
	public void setBusid(String busid) {
		this.busid = busid;
	}
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public int getDurationoftravel() {
		return durationoftravel;
	}
	public void setDurationoftravel(int durationoftravel) {
		this.durationoftravel = durationoftravel;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public String getRouteid() {
		return routeid;
	}
	public void setRouteid(String routeid) {
		this.routeid = routeid;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public Date getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(Date departuredate) {
		this.departuredate = departuredate;
	}
	public Date getArrivaldate() {
		return arrivaldate;
	}
	public void setArrivaldate(Date arrivaldate) {
		this.arrivaldate = arrivaldate;
	}
	public Bus(String busid, String busname, String bustype, int durationoftravel, String arrivaltime,
			String departuretime, int availableseats, int totalseats, int fare, String routeid, int distance,
			Date departuredate, Date arrivaldate) {
		super();
		this.busid = busid;
		this.busname = busname;
		this.bustype = bustype;
		this.durationoftravel = durationoftravel;
		this.arrivaltime = arrivaltime;
		this.departuretime = departuretime;
		this.availableseats = availableseats;
		this.totalseats = totalseats;
		this.fare = fare;
		this.routeid = routeid;
		this.distance = distance;
		this.departuredate = departuredate;
		this.arrivaldate = arrivaldate;
	}
	public Bus() {
		super();
		
	}
	
	
}