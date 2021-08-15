package com.lti.bus.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.bus.model.Booking;
import com.lti.bus.model.Bus;
import com.lti.bus.model.Feedback;
import com.lti.bus.model.Passenger;
import com.lti.bus.model.Payment;
import com.lti.bus.model.Routes;
import com.lti.bus.model.Seats;
import com.lti.bus.model.UserDetails;
import com.lti.bus.repository.BookingRepository;
import com.lti.bus.repository.BusRepository;
import com.lti.bus.repository.FeedbackRepository;
import com.lti.bus.repository.PassengerRepository;
import com.lti.bus.repository.PaymentRepository;
import com.lti.bus.repository.RouteRepository;
import com.lti.bus.repository.SeatsRepo;
import com.lti.bus.repository.UserDetailsRepository;

@Service
@Transactional
public class BookingService {
	@Autowired
	BookingRepository bookingRepo;
	@Autowired
	SeatsRepo seatsRepo;
	@Autowired
	FeedbackRepository feedbackRepo;

	
	@Autowired
	PaymentRepository paymentRepo;
	
	@Autowired
	PassengerRepository passengerRepo;
	
	@Autowired
	UserDetailsRepository userdetailsRepo;
	
	
	public List<Booking> getBooking(){
		return bookingRepo.findAll();
	}
	public Booking findBooking(String bookingId) {
		return bookingRepo.getById(bookingId);
	}
	
	public boolean addBooking(Booking booking) {
		bookingRepo.save(booking);
		return true;
		
	}

	public boolean updateBooking(Booking booking) {
		bookingRepo.save(booking);
		return true;
	}	
	

	public boolean delBooking(String id) {
		bookingRepo.deleteById(id);
		return true;
	}
	
	public List<Seats> findSeats() {
		List<Seats> ls = seatsRepo.findAll();
		return ls;		
		
	}
//	public boolean addSeats(Seats seats) {
//		seatsRepo.save(seats);
//		return true;
//		
//	}

	public boolean updateSeats(Seats seats) {
		seatsRepo.save(seats);
		return true;
	}	
	

	public boolean delSeats(String id) {
		seatsRepo.deleteById(id);
		return true;
	}
	
	
	public Payment findPayment(String paymentId) {
		return paymentRepo.getById(paymentId);
	}
	
	public boolean addPayment(Payment payment) {
		paymentRepo.save(payment);
		return true;
		
	}

	public boolean updatePayment(Payment payment) {
		paymentRepo.save(payment);
		return true;
	}
	
	public boolean delPayment(String id) {
		paymentRepo.deleteById(id);
		return true;
	}
	
	public Feedback findFeedback(String feedbackId) {
		return feedbackRepo.getById(feedbackId);
	}
	
	public boolean addFeedback(Feedback feedback) {
		feedbackRepo.save(feedback);
		return true;
		
	}

	public boolean updateFeedback(Feedback feedback) {
		feedbackRepo.save(feedback);
		return true;
	}
	
	public boolean delFeedback(String id) {
		feedbackRepo.deleteById(id);
		return true;
	}
	
	@Autowired
	BusRepository busRepo;
	@Autowired
	RouteRepository routeRepo;
	
	
	public List<Bus> getBus() {
		
		return busRepo.findAll();
	}
	

	
	public boolean addBus(Bus bus) {
		busRepo.save(bus);
		return true;
	}

	
	public boolean updateBus(Bus bus) {
		Bus newb=busRepo.findById(bus.getBusid()).get();
		newb=bus;
		busRepo.save(newb);
		return true;
	}


	public boolean deleteBus(Bus bus) {
		busRepo.delete(bus);
		return true;
	}
	
	
	
	

//	public List<Routes> getRoutes() {
//		
//		return routeRepo.findAll();
//	}


	public boolean addRoutes(Routes route) {
		routeRepo.save(route);
		return true;
	}


	public boolean updateRoutes(Routes route) {
		Routes newr=routeRepo.findById(route.getRouteid()).get();
		newr=route;
		routeRepo.save(route);
		return true;
	}


	public boolean deleteRoutes(Routes route) {
		routeRepo.delete(route);
		return true;
	}
	
	public Passenger findPassenger(String passengerId) {
		return passengerRepo.getById(passengerId);
	}
	
	public boolean addPassenger(Passenger passenger) {
		passengerRepo.save(passenger);
		return true;
		
	}

	public boolean updatePassenger(Passenger passenger) {
		passengerRepo.save(passenger);
		return true;
	}	
	
	public boolean deletePassenger(String passengerId) {
		//Booking book = bookingService.findBooking(bookingId);
		passengerRepo.deleteById(passengerId);
		System.out.println("delete");
		return true;
	}

	public UserDetails findUserDetails(String userId) {
		return userdetailsRepo.getById(userId);
	}
	
	public boolean addUserDetails(UserDetails userdetails) {
		userdetailsRepo.save(userdetails);
		return true;
		
	}

	public boolean updateUserDetails(UserDetails userdetails) {
		userdetailsRepo.save(userdetails);
		return true;
	}
	
	public boolean deleteUserDetails(String id) {
		userdetailsRepo.deleteById(id);
		return true;
	}
	
	public UserDetails findUserDetailsByMailId(String mailId) {
		return userdetailsRepo.findUserDetailsByMailId(mailId);
	}
	
	//vishnu
	
	public List<Booking> findByBusIdBookings(String busId) {
		return bookingRepo.findByBusIdBookings(busId);
	}
	
	public List<Booking> findByEmailIdBookings(String mailId) {
		System.out.println(mailId);
		return bookingRepo.findByEmailIdBookings(mailId);
	}
	
	public boolean updateUserDetailsv(UserDetails userDetails) {
		UserDetails newb=userdetailsRepo.findById(userDetails.getUserId()).get();
		newb=userDetails;
		userdetailsRepo.save(newb);
		return true;
	}
	
	public Bus findByBusIdBuses(String busId) {
		return bookingRepo.findBusIdBookings(busId);
	}
	
//	public UserDetails findUserDetails(String userId) {
//		return userdetailsRepo.getById(userId);
//	}
	
	//Anjaneya
	
	public Double getWalletInfo(String mailId) {
		return userdetailsRepo.getWalletInfo(mailId);
	}
	public List<Bus> findBusByRouteId(String s1){
		return busRepo.findBusByRouteId(s1);
	}
	
	public List<Bus> findBusByRouteIdandDate(String s1, Date d1){
	return busRepo.findBusByRouteIdandDate(s1, d1);
	}
	
	public Bus busByBusId(String busId) {
		return busRepo.getById(busId);
	}
	
	public List<Seats> findByBusId(String busId){
		return seatsRepo.findByBusId(busId);
	}
	
	//Madhu
	
	public List<Booking> findByBusIdBookingsMadhu(String emailId) {
		return bookingRepo.findByEmailIdBookings(emailId);
	}
//	public List<Passenger> findByBookingIdPassenger(String bookingId) {
//		return passengerRepo.findByBookingIdPassenger(bookingId);
//		
//	}
	
	public Passenger findByBookingIdPassenger(String bookingId) {
		return passengerRepo.findByBookingIdPassenger(bookingId);
		
	}
	/*public void addseatcount(String busId, String bookingId)
	{
		busRepo.addseatcount(busId, bookingId);
	}*/
	public void deletebookingdetails(String bookingId){
		bookingRepo.deletebookingdetails(bookingId);
	}
	
	public Seats seatsRecordBySeatId(String seatId) {
		return seatsRepo.seatsRecordBySeatId(seatId);
	}
	public boolean updateSeatsRecordBySeatId(Seats seats) {
		 seatsRepo.save(seats);
		 return true;
	}
	
	//Mahesh
	
     public List<Bus> getBuses() {
		
		return busRepo.getallbuses();
	}
	
     public List<Routes> getRoutes() {
 		
 		return routeRepo.getALLRoutes();
 	}
     public Bus findBus(String busid){
 		return busRepo.findById(busid).get();
 	}
 	
 	public Routes findRoute(String routeid) {
 		return routeRepo.findById(routeid).get();
 	}
 	public boolean deleteRoutebyId(String routeid) {
 		routeRepo.deleteById(routeid);
 		return true;
 	}
 	public boolean deleteBusbyId(String busid) {
 		busRepo.deleteById(busid);
 		return true;
 	}
 	public boolean addSeats(Seats seat) {
 		seatsRepo.save(seat);
 		return true;
 	}
 	
 	public List<Booking> findBookingsBydates(Date d1,Date d2){
 		return bookingRepo.findBookingsBydates(d1, d2);
 	}
 	
 	public List<UserDetails> findOnlyUserDetails(String s){
 		return userdetailsRepo.findOnlyUserDetails(s);
 	}
 	public List<Booking> getBookingHistory(){
 		return bookingRepo.getBookingHistory();
 	}
 	
 	public List<Passenger> getallPassengerHistory(){
 		return passengerRepo.getPassengerHistory();
 	}
 	public List<Feedback> getallbusFeedback(){
 		return feedbackRepo.getbusFeedbacks();
 	}
 	
 	public void deleteAllSeats(String s) {
 		 seatsRepo.deleteAllSeats(s);
 		
 	}
	
	
	
}