package com.org.ftr.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.ftr.entities.FtrUser;
import com.org.ftr.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user/{id}")
	public FtrUser getuserdetailsbyID(@PathVariable("id") Integer id) {
		
		Optional<FtrUser>  user= userService.getUserbyID(id);
		if(user.isPresent()) {
			return user.get();
		}
		return new FtrUser() ;
	}
	
}
