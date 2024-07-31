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
	
	// Fetching terminal by id
	public Optional<FtrTerminal> getterminalbyID(String id) {
			return terminalRepository.findById(id);
		}
	// Insert new terminal
	public String createNewTerminal(FtrTerminal newTerminal) {
		Optional<FtrTerminal> terminalCheck = terminalRepository.findById(newTerminal.getTerminal_id());
		if(terminalCheck.isEmpty())
		{
				terminalRepository.save(newTerminal);
				return "New terminal has been created";
		}
		else {
			   return "Terminal already Present";
		}
	}
	
	//Update terminal
	public String updateTerminal(FtrTerminal terminal) {
		boolean isPresent = terminalRepository.existsById(terminal.getTerminal_id());
		if(isPresent) {
			terminalRepository.save(terminal);
			return "Details related to :" + terminal.getTerminal_name()+ "is Saved Successfully";
		}
		else
			return "No user found with this ID";
	}
	
	//Delete Terminal
	public String terminalDelete(String id) {
		Optional<FtrTerminal>  deleteTerminal =terminalRepository.findById(id);
		if(!deleteTerminal.isEmpty()) {
			terminalRepository.deleteById(id);
			  return "Terminal deleted Successfully";
		}
		else {
			return "Terminal does not exist";
		}
	}	

}