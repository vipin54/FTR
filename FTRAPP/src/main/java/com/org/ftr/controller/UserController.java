package com.org.ftr.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.ftr.entities.FtrUser;
import com.org.ftr.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/{id}")
	public FtrUser getuserdetailsbyID(@PathVariable("id") Integer id) {
		
		Optional<FtrUser>  user= userService.getUserbyID(id);
		if(user.isPresent()) {
			return user.get();
		}
		return new FtrUser() ;
	}
	
	@PutMapping("/create")
	public String updateUserdetails( @RequestBody FtrUser user){
		return userService.updateUser(user);
	}
	
}
