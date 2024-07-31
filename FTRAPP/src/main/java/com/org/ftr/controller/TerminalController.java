package com.org.ftr.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.ftr.entities.FtrTerminal;
import com.org.ftr.entities.FtrUser;
import com.org.ftr.service.TerminalService;


@RestController
@RequestMapping("terminal")
public class TerminalController {
	
	@Autowired
	TerminalService terminalService;
	
	@GetMapping("/{id}")
	public FtrTerminal getterminaldetailsbyID(@PathVariable("id") String id)
	{
		
		Optional<FtrTerminal>  terminal= terminalService.getterminalbyID(id);
		if(terminal.isPresent()) {
			return terminal.get();
		}
		return new FtrTerminal() ;
	}
	
	@PostMapping("/createterminal")
	public String createNewTerminal(@RequestBody FtrTerminal newTerminal) {  
		
	     return terminalService.createNewTerminal(newTerminal);
	     
	}	
}
