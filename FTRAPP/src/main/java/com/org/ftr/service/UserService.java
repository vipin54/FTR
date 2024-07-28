package com.org.ftr.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.ftr.entities.FtrUser;
import com.org.ftr.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	
	// Fetching user by id
	public Optional<FtrUser> getUserbyID(Integer id) {
		return userRepository.findById(id);
	}
	
	public String  createNewUser(FtrUser newUser){
		Optional<FtrUser> userCHeck = userRepository.findById(newUser.getUser_id());
		System.out.println("userCHeck-->"+userCHeck);
		if(userCHeck.isEmpty())
		{
				userRepository.save(newUser);
				return "New user has been created";
		}
		else {
			   return "User already Present";
		}
	}
	
	public String updateUser( FtrUser user) {
		boolean isPresent = userRepository.existsById(user.getUser_id());
		if(isPresent) {
			userRepository.save(user);
			return "Details related to :" + user.getFirst_name()+ "is Saved Successfully";
		}
		else
			return "No user found with this ID";
	}
	
	//Delete user by id
	
	public String userDelete(Integer id)
	{
		Optional<FtrUser> userFind = userRepository.findById(id);
		if(!userFind.isEmpty()) {
			userRepository.deleteById(id);
			  return "User deleted Successfully";
		}
		else {
			return "User does not exist";
		}
		
	}

}
