
package com.lti.bus.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.lti.bus.model.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, String> {
	
	@Query(value = "from Passenger pa where pa.bookingId = ?1")
	//public List<Passenger> findByBookingIdPassenger(String bookingId);
    
	public Passenger findByBookingIdPassenger(String bookingId);
	
	@Query("select x from Passenger x ORDER BY x.passengerId")
	public List<Passenger> getPassengerHistory();
	
}