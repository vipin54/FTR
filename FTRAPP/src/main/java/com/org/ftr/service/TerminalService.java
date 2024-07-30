package com.org.ftr.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.ftr.entities.FtrTerminal;
import com.org.ftr.entities.FtrUser;
import com.org.ftr.repository.TerminalRepository;
import com.org.ftr.repository.UserRepository;


@Service
public class TerminalService {
	
	@Autowired
	TerminalRepository terminalRepository;
	
	// Fetching user by id
	public Optional<FtrTerminal> getterminalbyID(String id) {
			return terminalRepository.findById(id);
		}

}