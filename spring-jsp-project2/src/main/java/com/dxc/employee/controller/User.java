package com.dxc.employee.controller;

import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
@EntityScan
@Table(name="LoginUser")
public class User {
	
	@Id
	private String username;
	private String passwrd;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", passwrd=" + passwrd + "]";
	}
	
	

}
