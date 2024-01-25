package com.templeconnect.project.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.templeconnect.project.model.PaymentMaster;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentMaster, Long>{


	
}
