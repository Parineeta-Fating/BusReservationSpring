package com.lti.bus.repository;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.lti.bus.model.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
	
	
	
}