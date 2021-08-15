

package com.lti.bus.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.bus.model.Booking;
import com.lti.bus.model.Bus;
import com.lti.bus.model.UserDetails;
@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {
	 //vishnu
	@Query(value = "from Booking bo where bo.busId = ?1")
	public List<Booking> findByBusIdBookings(String busId);
	
	//getbookings by emailid
	@Query(value = "from Booking bo where bo.emailId = ?1")
	public List<Booking> findByEmailIdBookings(String emailId);
	
	
	
	
	//getbuses byid in booking
	@Query(value = "from Booking bo where bo.busId = ?1")
	public Bus findBusIdBookings(String busId);
	
	
	
	
	//update userdetails with userid

	@Query(value = "UPDATE UserDetails ud SET ud.firstName = ?1 where ud.userId = ?2")
	public UserDetails updateUserFirstNameDetails(String firstName, String userId);
	
	
	//Madhu
	
//	@Query(value = "from Booking bo where bo.emailId = ?1")
//	public List<Booking> findByEmailIdBookings(String emailId);
    @Modifying
	@Query(value="Delete from Booking bo where bo.bookingId = ?1") 
	public void deletebookingdetails(String bookingId);
    
    //Mahesh
    
    @Query("from Booking b where b.dateOfBooking<?1 and b.dateOfBooking>?2 ORDER BY b.bookingId")
	public List<Booking> findBookingsBydates(Date d1,Date d2);
	
	@Query("select f from Booking f ORDER BY f.bookingId")
	public List<Booking> getBookingHistory();
	
}