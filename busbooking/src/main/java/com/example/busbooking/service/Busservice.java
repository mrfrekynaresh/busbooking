package com.example.busbooking.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.busbooking.modal.Busdata;
import com.example.busbooking.repository.BusRep;
@Component("busservice")
@Service
public class Busservice {
	@Autowired
	@Qualifier("bus")
	private Busdata bus;
	
	@Autowired
	@Qualifier("busrep")
	private BusRep sep;
	
	public Busdata serbus(String busstart,String busend) {
		List<Busdata> st= new ArrayList<Busdata>(sep.findAll());
		for(Busdata a:st) {
			if(a.getBus_Start().equals(busstart) && a.getBus_end().equals(busend) && a.getBus_set()>0) {
				return a;
			}
		}
		return null;
	}
	
	public void busadd(String bus_name, int bus_set, String bus_number, String bus_Start, String bus_end, String ac_not,
			LocalDate bus_date, LocalTime bus_start_time, LocalTime bus_end_time) {
		
		Busdata add=new Busdata(bus_name,bus_set,bus_name,bus_Start,bus_end,ac_not,bus_date,bus_start_time,bus_end_time);
		sep.save(add);
	}
	
	public List<Busdata> listshow() {
		return sep.findAll();
	}
	public boolean deletebus(String busname,String busnum) {
		List<Busdata> b2=sep.findAll();
		for(Busdata a:b2) {
			if(a.getBus_name().equals(busname) && a.getBus_number().equals(busnum)) {
				sep.delete(a);
				return true;
			}
		}
		return false;
	}
	
	

}
