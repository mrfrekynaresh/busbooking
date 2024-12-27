package com.example.busbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.busbooking.service.mainservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class maincontroller {
	@Autowired
	private mainservice serv;
	
	@GetMapping("/login")
	public String loginname() {
		return "mainlogin";
	}
	
	@PostMapping("/procss")
	public String postMethodName(@RequestParam("email") String email,@RequestParam("password") String password) {
		if(serv.chekemailpassword(email, password)) {
			return "busadd";
		}
		return"fail";
	}
	
	
	

}
