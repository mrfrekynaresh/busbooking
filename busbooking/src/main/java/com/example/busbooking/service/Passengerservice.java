package com.example.busbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.busbooking.modal.Busdata;
import com.example.busbooking.modal.Passenger;
import com.example.busbooking.repository.BusRep;
import com.example.busbooking.repository.PassemgerRep;

@Service
public class Passengerservice {
	@Autowired
	@Qualifier("pas")
	private Passenger pas;

	@Autowired
	@Qualifier("busservice")
	Busservice busservice;
	
	@Autowired
	@Qualifier("busrep")
	private BusRep sep;
	
	@Autowired
	@Qualifier("passrep")
	private PassemgerRep pasrep;

	public void savepass(String name, int age, String gender, String id_card_type, String id_card_number,
			String adult_chlid, String bus_num) {
		List<Busdata> s2 = busservice.listshow();
		for (Busdata a : s2) {
			if (a.getBus_name().equals(bus_num)) {
				 a.setBus_set(a.getBus_set()-1);
				 sep.save(a);
				Passenger add = new Passenger(name, age, gender, id_card_type, id_card_number, adult_chlid, bus_num);
				pasrep.save(add);

			}
		}

	}
	public List<Passenger> passlist(){
		return pasrep.findAll();
	}
	public boolean deletepass(String name,String bus_name) {
		List<Passenger> p2=pasrep.findAll();
		for(Passenger s:p2) {
			if(s.getName().equals(name) && s.getBus_num().equals(bus_name)) {
				pasrep.delete(s);
				return true;
			}
		}
		return false;
	}

}
