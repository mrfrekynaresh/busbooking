package com.example.busbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.busbooking.service.Passengerservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Passengercontroller {
	@Autowired
	private Passengerservice pas;

	@PostMapping("/booking")
	public String postMethodbook(@RequestParam("name") String name, @RequestParam("gender") String gender, @RequestParam("age") int age,
			@RequestParam("adult_child") String adultchlid, @RequestParam("bus_num") String busnum, @RequestParam("id_card_number") String id_card_number,
			@RequestParam("id_card_type") String id_card_type) {
		pas.savepass(name, age, gender, id_card_type, id_card_number, adultchlid, busnum);
		return "sucess";
	}
	
	@GetMapping("/passlist")
	public String getMethodpasslist(Model m) {
		m.addAttribute("passadd", pas.passlist());
		return "passdelete";
	}
	@GetMapping("/deletepass")
	public String getMethodName(@RequestParam("name") String name,@RequestParam("busnum") String bus_number) {
		
		if(pas.deletepass(name, bus_number)) {
			return "sucess";
		}
		return"fail";
	}
	
	

}
