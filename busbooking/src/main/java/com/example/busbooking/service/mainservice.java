package com.example.busbooking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.busbooking.modal.main;
import com.example.busbooking.repository.mainrep;

@Service
public class mainservice {
	@Autowired
	@Qualifier("mainrep")
	private mainrep main2;
	
	@Autowired
	@Qualifier("main")
	main maine;
	
	public boolean chekemailpassword(String email,String password) {
		List<main> mr=new ArrayList<main>(main2.findAll());
		for(main a:mr) {
			if(a.getEmail().equals(email) & a.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
