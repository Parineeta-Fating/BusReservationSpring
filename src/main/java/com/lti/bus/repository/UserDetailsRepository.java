

package com.lti.bus.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.lti.bus.model.UserDetails;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, String> {
	
	@Query("select u from UserDetails u where u.mailId = ?1")
	public UserDetails findUserDetailsByMailId(String mailId);
	
	@Query("select p.wallet from UserDetails p where mailId= ?1")
	public Double getWalletInfo(String mailId);
	
	@Query("select a from UserDetails a where a.role=?1")
	public List<UserDetails> findOnlyUserDetails(String s);
	
}
