
package com.lti.bus.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.bus.model.Seats;
@Repository

public interface SeatsRepo extends JpaRepository<Seats, String> {
	
	@Query("from Seats where busId=?1")
	public List<Seats> findByBusId(String busId);
	
	@Query(value = "from Seats where seatId = ?1")
	public Seats seatsRecordBySeatId(String seatId);
	
	@Modifying
	@Query("delete  from Seats x where x.busId=?1")
	public void deleteAllSeats(String d);
	
}