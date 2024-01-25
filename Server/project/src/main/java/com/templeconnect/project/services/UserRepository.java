package com.templeconnect.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.templeconnect.project.model.UserMaster;
@Repository
public interface UserRepository extends JpaRepository<UserMaster, Long>{
	List<UserMaster> findByUsername(String username);
}
