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
	
	public Optional<FtrUser> getUserbyID(Integer id) {
		return userRepository.findById(id);
	}

}
