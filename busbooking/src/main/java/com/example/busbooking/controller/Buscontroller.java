package com.example.busbooking.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.busbooking.modal.Busdata;
import com.example.busbooking.service.Busservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Buscontroller {
	@Autowired
	private Busservice bus;

	@GetMapping("/home")
	public String get1() {
		return "first";
	}

	@PostMapping("/search")
	public String getMethodName(@RequestParam("start") String busstart, @RequestParam("end") String busend,
			Model modal) {
		if (bus.serbus(busstart, busend) == null) {
			return "fail";
		} else {
			modal.addAttribute("bussearch", bus.serbus(busstart, busend));
			return "busbooking";
		}
	}

	@PostMapping("/add")
	public String postMethodName(@RequestParam("name") String bus_name, @RequestParam("set") int bus_set,
			@RequestParam("number") String bus_number, @RequestParam("start") String bus_start,
			@RequestParam("end") String bus_end, @RequestParam("acnot") String ac_not,
			@RequestParam("date") String bus_date, @RequestParam("starttime") String bus_start_time,
			@RequestParam("endtime") String bus_end_time) {
		LocalDate data = LocalDate.parse(bus_date);
		LocalTime timest = LocalTime.parse(bus_start_time);
		LocalTime timeen = LocalTime.parse(bus_end_time);
		bus.busadd(bus_name, bus_set, bus_number, bus_start, bus_end, ac_not, data, timest, timeen);

		return "mainlogin";
	}

	@GetMapping("/show")
	public String listshow(Model modal) {
		modal.addAttribute("list", bus.listshow());
		
		return "shoebusdata";
	}
	
	@GetMapping("/deletebus")
	public String getMethodName(@RequestParam("busname") String name,@RequestParam("busnum") String bus_number) {
		
		if(bus.deletebus(name, bus_number)) {
			return "sucess";
		}
		return"fail";
	}
	@GetMapping("/busshow")
	public String listshowbus(Model modal) {
		modal.addAttribute("listshow", bus.listshow());
		
		return "busdelete";
	}

}
