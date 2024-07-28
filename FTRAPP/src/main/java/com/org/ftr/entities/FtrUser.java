package com.org.ftr.entities;

import java.math.BigDecimal;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ftr_user")
public class FtrUser {
	
	//@Column(name = "user_id")
	@Id
	Integer user_id;
	
	@Nonnull
	String first_name;
	
	String last_name;
	
	@Nonnull
	String email_id;
	
	BigDecimal mobile_number;
	
	String password;
	
	String nationality;
	
//	@Column(length = 5)
//	@Size(min = 3, max = 5)
	String passport_number;
	
	String permanent_address;
	
	String office_address;
	
	BigDecimal personal_identification_number;
	
	
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public BigDecimal getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(BigDecimal mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPassport_number() {
		return passport_number;
	}

	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}

	public String getPermanent_address() {
		return permanent_address;
	}

	public void setPermanent_address(String permanent_address) {
		this.permanent_address = permanent_address;
	}

	public String getOffice_address() {
		return office_address;
	}

	public void setOffice_address(String office_address) {
		this.office_address = office_address;
	}

	public BigDecimal getPersonal_identification_number() {
		return personal_identification_number;
	}

	public void setPersonal_identification_number(BigDecimal personal_identification_number) {
		this.personal_identification_number = personal_identification_number;
	}


}
