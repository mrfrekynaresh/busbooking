package com.example.busbooking.modal;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Component("bus")
@Entity
public class Busdata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Bus_name;
	private int Bus_set;
	private String Bus_number;
	private String Bus_Start;
	private String Bus_end;
	private String Ac_not;
	private LocalDate Bus_date;
	private LocalTime Bus_start_time;
	private LocalTime Bus_end_time;
	
	public Busdata(String bus_name, int bus_set, String bus_number, String bus_Start, String bus_end, String ac_not,
			LocalDate bus_date, LocalTime bus_start_time, LocalTime bus_end_time) {
		Bus_name = bus_name;
		Bus_set = bus_set;
		Bus_number = bus_number;
		Bus_Start = bus_Start;
		Bus_end = bus_end;
		Ac_not = ac_not;
		Bus_date = bus_date;
		Bus_start_time = bus_start_time;
		Bus_end_time = bus_end_time;
	}
	public Busdata() {
		
	}
	public LocalDate getBus_date() {
		return Bus_date;
	}
	public void setBus_date(LocalDate bus_date) {
		Bus_date = bus_date;
	}
	public LocalTime getBus_start_time() {
		return Bus_start_time;
	}
	public void setBus_start_time(LocalTime bus_start_time) {
		Bus_start_time = bus_start_time;
	}
	public LocalTime getBus_end_time() {
		return Bus_end_time;
	}
	public void setBus_end_time(LocalTime bus_end_time) {
		Bus_end_time = bus_end_time;
	}
	public String getBus_name() {
		return Bus_name;
	}
	public void setBus_name(String bus_name) {
		Bus_name = bus_name;
	}
	public int getBus_set() {
		return Bus_set;
	}
	public void setBus_set(int bus_set) {
		Bus_set = bus_set;
	}
	public String getBus_number() {
		return Bus_number;
	}
	public void setBus_number(String bus_number) {
		Bus_number = bus_number;
	}
	public String getBus_Start() {
		return Bus_Start;
	}
	public void setBus_Start(String bus_Start) {
		Bus_Start = bus_Start;
	}
	public String getBus_end() {
		return Bus_end;
	}
	public void setBus_end(String bus_end) {
		Bus_end = bus_end;
	}
	public String getAc_not() {
		return Ac_not;
	}
	public void setAc_not(String ac_not) {
		Ac_not = ac_not;
	}
	
	

}
