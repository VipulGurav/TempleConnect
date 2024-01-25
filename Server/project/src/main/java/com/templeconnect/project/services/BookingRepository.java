package com.templeconnect.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.templeconnect.project.model.BookingMaster;
@Repository 
public interface BookingRepository extends JpaRepository<BookingMaster, Long> {

	
	List<BookingMaster> findByUserId(Long userId);
}
