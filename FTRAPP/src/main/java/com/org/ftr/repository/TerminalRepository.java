package com.org.ftr.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.ftr.entities.FtrTerminal;

@Repository
public interface TerminalRepository  extends JpaRepository<FtrTerminal, String>{

	

}



