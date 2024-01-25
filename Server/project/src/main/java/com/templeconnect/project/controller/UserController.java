package com.templeconnect.project.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.templeconnect.project.model.LoginRequest;
import com.templeconnect.project.model.UserMaster;
import com.templeconnect.project.services.UserRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	 @Autowired
	    private UserRepository userRepo;
    
	 @GetMapping("/example")
    public ResponseEntity<String> example() {
        return ResponseEntity.ok("Hello, World!");
    }
     @GetMapping("/{id}")
    public UserMaster getUser(@PathVariable Long id) {
        return userRepo.findById(id).orElse(null);
    } 

     @PostMapping("/login")
     public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
    	List<UserMaster> ls= userRepo.findByUsername(loginRequest.getUsername());
    	if (ls.isEmpty()) {
    		return ResponseEntity.ok("Login Unsuccesful");
    	}else if(ls.get(0).getPassword().equals(loginRequest.getPassword())) {
    		return ResponseEntity.ok(ls);
    	}else {
    		return ResponseEntity.ok("Login Unsuccesful");
    	}
     } 
 
       
    @PostMapping("/adduser")
    public UserMaster createUser(@RequestBody UserMaster user) {
        return userRepo.save(user);
    }
 
    @PutMapping("/{id}")
    public UserMaster updateUser(@PathVariable Long id, @RequestBody UserMaster user) {
        UserMaster existingUser = userRepo.findById(id).orElse(null);
        if (existingUser == null) {
            return null;
        } 
         user.setUserId(existingUser.getUserId());
        return userRepo.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepo.deleteById(id);
    }
   
}