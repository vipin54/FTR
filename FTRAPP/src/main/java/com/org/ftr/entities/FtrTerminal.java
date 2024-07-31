package com.org.ftr.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ftr_terminals")
public class FtrTerminal {
	
	@Id
	String terminal_id;
	
	String terminal_name;
	
	String country;
	
	String item_type;
	
	String terminal_Description;
	
	Integer capacity;
	
	Integer available_capacity;
	
	String status;
	
	@Column(name = "harborlocation")
	String harborLocation;

	public String getTerminal_id() {
		return terminal_id;
	}

	public void setTerminal_id(String terminal_id) {
		this.terminal_id = terminal_id;
	}

	public String getTerminal_name() {
		return terminal_name;
	}

	public void setTerminal_name(String terminal_name) {
		this.terminal_name = terminal_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getItem_type() {
		return item_type;
	}

	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}

	public String getTerminal_Description() {
		return terminal_Description;
	}

	public void setTerminal_Description(String terminal_Description) {
		this.terminal_Description = terminal_Description;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getAvailable_capacity() {
		return available_capacity;
	}

	public void setAvailable_capacity(Integer available_capacity) {
		this.available_capacity = available_capacity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHarborLocation() {
		return harborLocation;
	}

	public void setHarborLocation(String harborLocation) {
		this.harborLocation = harborLocation;
	}
	
	

}
