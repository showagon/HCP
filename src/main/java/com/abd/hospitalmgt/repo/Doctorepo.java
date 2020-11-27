package com.abd.hospitalmgt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abd.hospitalmgt.entity.Doctors;


public interface Doctorepo extends JpaRepository<Doctors, Integer>{

	List<Doctors> findByFlag(int flag);
	
	
}
