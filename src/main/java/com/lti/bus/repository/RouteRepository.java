

package com.lti.bus.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.bus.model.Routes;
@Repository
public interface RouteRepository extends JpaRepository<Routes, String> {
	
	@Query("select x from Routes x ORDER BY x.routeid")
	public List<Routes> getALLRoutes();
	
}