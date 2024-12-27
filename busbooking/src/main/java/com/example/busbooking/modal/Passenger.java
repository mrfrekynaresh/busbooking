package com.example.busbooking.modal;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Component("pas")
@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private int Age;
	private String Gender;
	private String Id_card_type;
	private String Id_card_number;
	private String Adult_chlid;
	private String Bus_num;
	
	
	public Passenger(String name, int age, String gender, String id_card_type, String id_card_number,
			String adult_chlid,String bus_num) {
		Name = name;
		Age = age;
		Gender = gender;
		Id_card_type = id_card_type;
		Id_card_number = id_card_number;
		Adult_chlid = adult_chlid;
		Bus_num=bus_num;
	}
	public Passenger(){
		
	}
	public String getBus_num() {
		return Bus_num;
	}
	public void setBus_num(String bus_num) {
		Bus_num = bus_num;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getId_card_type() {
		return Id_card_type;
	}
	public void setId_card_type(String id_card_type) {
		Id_card_type = id_card_type;
	} 
	public String getId_card_number() {
		return Id_card_number;
	}
	public void setId_card_number(String id_card_number) {
		Id_card_number = id_card_number;
	}
	public String getAdult_chlid() {
		return Adult_chlid;
	}
	public void setAdult_chlid(String adult_chlid) {
		Adult_chlid = adult_chlid;
	}
	
	
}
