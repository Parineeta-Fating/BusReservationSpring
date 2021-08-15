
package com.lti.bus.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.bus.model.Bus;
import com.lti.bus.model.Seats;
@Repository
public interface BusRepository extends JpaRepository<Bus, String> {
	
	@Query("from Bus b where b.routeid = ?1")
	public List<Bus> findBusByRouteId(String s1);
	
	@Query("from Bus b where b.routeid = ?1 and b.departuredate = ?2")
	public List<Bus> findBusByRouteIdandDate(String s1, Date d1);
	
	@Query("select x from Bus x ORDER BY x.busid")
	public List<Bus> getallbuses();
	
}