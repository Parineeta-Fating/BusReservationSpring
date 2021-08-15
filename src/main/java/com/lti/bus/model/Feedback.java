

package com.lti.bus.model;

import javax.persistence.*;

@Entity
@Table(name = "Feedback")
public class Feedback {
	
	@Id
	@Column(name = "Feedback_Id")
	private String feedbackId;
	@Column(name = "Feedback_Msg")
	private String feedbackMsg;
	@Column(name = "Bus_Id")
	private String busId;
	
	
	public Feedback() {
		super();
	}
	public Feedback(String feedbackId, String feedbackMsg, String busId) {
		super();
		this.feedbackId = feedbackId;
		this.feedbackMsg = feedbackMsg;
		this.busId = busId;
	}
	
	public String getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getFeedbackMsg() {
		return feedbackMsg;
	}
	public void setFeedbackMsg(String feedbackMsg) {
		this.feedbackMsg = feedbackMsg;
	}

	
	
	
	
}