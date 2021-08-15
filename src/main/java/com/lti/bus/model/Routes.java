

package com.lti.bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROUTES")
public class Routes {
	@Id
	@Column(name="ROUTE_ID")
	private String routeid;
	@Column(name="SOURCE")
	private String source;
	@Column(name="DESTINATION")
	private String destination;
	public String getRouteid() {
		return routeid;
	}
	public void setRouteid(String routeid) {
		this.routeid = routeid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Routes(String routeid, String source, String destination) {
		super();
		this.routeid = routeid;
		this.source = source;
		this.destination = destination;
	}
	public Routes() {
		super();
	}
	
	
}
