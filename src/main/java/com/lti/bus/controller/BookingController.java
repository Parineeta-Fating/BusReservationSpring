package com.lti.bus.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.bus.model.Booking;
import com.lti.bus.model.Bus;
import com.lti.bus.model.Feedback;
import com.lti.bus.model.Passenger;
import com.lti.bus.model.Payment;
import com.lti.bus.model.Routes;
import com.lti.bus.model.Seats;
import com.lti.bus.model.UserDetails;
import com.lti.bus.service.BookingService;

import oracle.jdbc.proxy.annotation.Post;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/bookingRest/api")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	Booking booking;
	
	/*@GetMapping("/booking")
	public Booking getBooking() {
		return bookingService.findBooking("3001");
	}*/
	
	@GetMapping("/booking")
	public List<Booking> getBookings(){
		return bookingService.getBooking();
	}
	@PostMapping("/booking")
	public boolean addBoooking(@RequestBody Booking booking  ) {
		return bookingService.addBooking(booking);	
	}
	
	@PutMapping("/booking")
	public boolean updateBooking(@RequestBody Booking booking) {
		return bookingService.updateBooking(booking);
	}

	
	@DeleteMapping("/booking")
	public boolean deleteBooking (@RequestBody String booking) {
		return bookingService.delBooking(booking);
	}
	
	@GetMapping("/seats")
	public List<Seats> getSeats() {
		return bookingService.findSeats();
	}
//	@PostMapping("/seats")
//	public boolean addSeats(@RequestBody Seats seats  ) {
//		return bookingService.addSeats(seats);	
//	}
	
	@PutMapping("/seats")
	public boolean updateSeats(@RequestBody Seats seats) {
		return bookingService.updateSeats(seats);
	}

	
	@DeleteMapping("/seats")
	public boolean deleteSeats (@RequestBody String seats) {
		return bookingService.delSeats(seats);
	}
	
	@GetMapping("/payment")
	public Payment getPayment() {
		return bookingService.findPayment("4001");
	}
	@PostMapping("/payment")
	public boolean addPayment(@RequestBody Payment payment) {
		return bookingService.addPayment(payment);	
	}
	
	@PutMapping("/payment")
	public boolean updatePayment(@RequestBody Payment payment) {
		return bookingService.updatePayment(payment);
	}
	
	
	@DeleteMapping("/payment")
	public boolean deletePayment(@RequestBody String payment) {
		return bookingService.delPayment(payment);
	}

	@GetMapping("/feedback")
	public Feedback getFeedback() {
		return bookingService.findFeedback("5001");
	}
	@PostMapping("/feedback")
	public boolean addFeedback(@RequestBody Feedback feedback) {
		return bookingService.addFeedback(feedback);	
	}
	
	@PutMapping("/feedback")
	public boolean updateFeedback(@RequestBody Feedback feedback) {
		return bookingService.updateFeedback(feedback);
	}
	
	@DeleteMapping("/feedback")
	public boolean deleteFeedback(@RequestBody String feedback) {
		return bookingService.delFeedback(feedback);
	}


	@GetMapping("/bus")
	public List<Bus> getAllBus(){
		return bookingService.getBuses();
	}
	@PostMapping("/bus")
	public boolean addBus(@RequestBody Bus bus) {
		return bookingService.addBus(bus);
	}
	
	@PutMapping("/bus")
	public boolean updateBus(@RequestBody Bus bus) {
		return bookingService.updateBus(bus);
	}
	@DeleteMapping("/bus")
	public boolean deleteBus(@RequestBody Bus bus) {
		return bookingService.deleteBus(bus);
	}
	
	
	@GetMapping("/routes")
	public List<Routes> getAllRoutes(){
		return bookingService.getRoutes();
	}
	@PostMapping("/routes")
	public boolean addRoute(@RequestBody Routes route) {
		return bookingService.addRoutes(route);
	}
	@PutMapping("/routes")
	public boolean updateRoute(@RequestBody Routes route) {
		return bookingService.updateRoutes(route);
	}
	@DeleteMapping("/routes")
	public boolean deleteRoute(@RequestBody Routes route) {
		return bookingService.deleteRoutes(route);
	}
	
	@GetMapping("/passenger")
	public Passenger getPassenger() {
		return bookingService.findPassenger("5001");
	}
	
	
	
	@PostMapping("/passenger")
	public boolean addPassenger(@RequestBody Passenger passenger ) {
		return bookingService.addPassenger(passenger);	
	}
	
	@PutMapping("/passenger")
	public boolean updatePassenger(@RequestBody Passenger passenger) {
		return bookingService.updatePassenger(passenger);
	}
	
	@DeleteMapping("/passenger")
	public boolean deletePassenger(@RequestBody String passengerId) {
		return bookingService.deletePassenger(passengerId);
	}

	@GetMapping("/userdetails")
	public UserDetails getUserDetails() {
		return bookingService.findUserDetails("4");
	}
	@PostMapping("/userdetails")
	public boolean addUserDetails(@RequestBody UserDetails userdetails) {
		return bookingService.addUserDetails(userdetails);	
	}
	
	@GetMapping("/userloginbymid/{mailId}")
	public UserDetails getUserDetailsByMailId(@PathVariable(value="mailId") String mailId) {
		return bookingService.findUserDetailsByMailId(mailId);
	}
	
	@PutMapping("/userdetails")
	public boolean updateUserDetails(@RequestBody UserDetails userdetails) {
		return bookingService.updateUserDetails(userdetails);
	}
	@DeleteMapping("/userdetails")
	public boolean deleteUserDetails(@RequestBody String userId) {
		return bookingService.deleteUserDetails(userId);
	}
	
	//Vishnu
	@GetMapping("/bookingByEmail/{emailId}")
	public List<Booking> getBookingsByEmailIdBookings(@PathVariable(value="emailId") String emailId) {
		return bookingService.findByEmailIdBookings(emailId);
	}
	
	@GetMapping("/busByBusId/{busId}")
	public Bus findByBusIdBuses(@PathVariable(value="busId") String busId) {
		return bookingService.findByBusIdBuses(busId);
		
	}
	
	@GetMapping("/userdetails/{userid}")
	public UserDetails getUserDetails(@PathVariable(value = "userid" ) String userid) {
		return bookingService.findUserDetails(userid);
	}
	
	//Anjaneya
	
	@GetMapping("/busbyri/{routeid}")
	public List<Bus> busByRouteId(@PathVariable(value="routeid") String rid){
		return bookingService.findBusByRouteId(rid); 
	}
	
	
	@GetMapping("/walletinfo/{mailid}")
	public Double getWalletInfo(@PathVariable(value="mailid") String mailId) {
		return bookingService.getWalletInfo(mailId);
	}
	
	
	@GetMapping("/seatbybus/{pr}")
	public List<Seats> seatsbybusid(@PathVariable(value="pr")String pr){
		System.out.println(pr);
		return bookingService.findByBusId(pr);
	}
	
	@GetMapping("/busByIdAnjan/{busId}")
	public Bus busById(@PathVariable(value="busId")String busId) {
		return bookingService.busByBusId(busId);
	}
	
	
	@GetMapping("/busbyr/{busid}/{date}")
	public List<Bus> busByRouteIdandDate(@PathVariable(value="busid") String prid,@PathVariable(value="date") String date) throws ParseException{
		Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		System.out.println(date);
		System.out.println(d1);
		return bookingService.findBusByRouteIdandDate(prid, d1);
	}
	
	
	//MadhuNisha
	
	
//	@GetMapping("/bookingByEmail/{emailId}")
//	public List<Booking> getBookingsByEmailIdBookings(@PathVariable(value="emailId") String emailId) {
//		return bookingService.findByBusIdBookingsMadhu(emailId);
//	}
	/*@GetMapping("/passengerByBooking/{bookingId}")
	public List<Passenger> getPassengerByBookingId(@PathVariable(value="bookingId")String bookingId){
		return bookingService.findByBookingIdPassenger(bookingId);
	}*/
	@GetMapping("/passengerByBooking/{bookingId}")
	public Passenger getPassengerByBookingId(@PathVariable(value="bookingId")String bookingId){
		 return bookingService.findByBookingIdPassenger(bookingId);
		
	}
		
	@DeleteMapping("/DeleteBookingDetails/{bookingId}")
	public void  deletebookingdetails(@PathVariable(value="bookingId")String bookingId) {
		 bookingService.deletebookingdetails(bookingId);
	}
	
	@GetMapping("/seats/{seatId}")	
	public Seats seatsRecordBySeatId(@PathVariable(value="seatId")String seatId) {
		return bookingService.seatsRecordBySeatId(seatId);
	}
	
	
	@PutMapping("/seatsMadhu")
	public boolean updateSeatsRecordBySeatId(@RequestBody Seats seats){
		return bookingService.updateSeatsRecordBySeatId(seats);
		
	}
	
	//Mahesh
	
	@GetMapping("/bus/{busid}")
	public Bus getBusById(@PathVariable(value="busid")String busid) {
		return bookingService.findBus(busid);
	}
	@GetMapping("/routes/{routeid}")
	public Routes getRouteById(@PathVariable(value="routeid")String routeid) {
		return bookingService.findRoute(routeid);
	}
	@DeleteMapping("/routes/{routeid}")
	public boolean deleteRoute(@PathVariable(value="routeid")String routeid) {
		return bookingService.deleteRoutebyId(routeid);
	}
	@DeleteMapping("/bus/{busid}")
	public boolean deleteBus(@PathVariable(value="busid")String busid) {
		return bookingService.deleteBusbyId(busid);
	}
	@PostMapping("/seats")
	public boolean addSeatstoBus(@RequestBody Seats seats) {
		return bookingService.addSeats(seats);
	}
	@GetMapping("/getbookingsbylimit/{dateOfBooking1}/{dateOfBooking2}")
	public List<Booking> findBookingsBydates(@PathVariable(value="dateOfBooking1")String date1,@PathVariable(value="dateOfBooking2")String date2) throws ParseException{
		Date d1=new SimpleDateFormat("yyyy-MM-dd").parse(date1);
		Date d2=new SimpleDateFormat("yyyy-MM-dd").parse(date2);
		System.out.println(d1);
		System.out.println(d2);
		return bookingService.findBookingsBydates(d1, d2);
	}
	
	@GetMapping("/getonlyuserdetails")
	public List<UserDetails> findOnlyUserDetails(){
		
		return bookingService.findOnlyUserDetails("user");
	}
	@GetMapping("/bookingHistory")
	public List<Booking> getBookingHistory(){
		return bookingService.getBookingHistory();
	}
	@GetMapping("/passengerHistory")
	public List<Passenger> getPassengerHistory(){
		return bookingService.getallPassengerHistory();
	}
	@GetMapping("/customerFeedbacks")
	public List<Feedback> getBusFeedback(){
		return bookingService.getallbusFeedback();
	}
	@DeleteMapping("/deleteallseats/{busId}")
	public void deleteAllSeats(@PathVariable(value="busId")String busId) {
		 bookingService.deleteAllSeats(busId);
	}
}