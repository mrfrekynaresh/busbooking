package com.example.busbooking.modal;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Component("main")
@Entity
public class main {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private String email;
	private String password;
	public main(){
		
	}
	public main(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
