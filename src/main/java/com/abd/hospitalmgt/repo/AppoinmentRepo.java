package com.abd.hospitalmgt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abd.hospitalmgt.entity.Appointment;



public interface AppoinmentRepo extends JpaRepository<Appointment, Integer>{

	
	List<Appointment> findByPname(String name);
}
