package com.example.busbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.example.busbooking.modal.Passenger;
@Component("passrep")
@Repository
public interface PassemgerRep extends JpaRepository<Passenger,Integer>{

}
