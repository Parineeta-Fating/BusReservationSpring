package com.lti.bus.model;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@Column(name = "payment_id")
	private String paymentId;
	@Column(name = "amount_paid")
	private int amountPaid;
	@Column(name = "booking_id")
	private String bookingId;
	@Column(name = "payment_mode")
	private String paymentMode;
	
	
	public Payment() {
		super();
	}
	public Payment(String paymentId, int amountPaid, String bookingId, String paymentMode) {
		super();
		this.paymentId = paymentId;
		this.amountPaid = amountPaid;
		this.bookingId = bookingId;
		this.paymentMode = paymentMode;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	
}