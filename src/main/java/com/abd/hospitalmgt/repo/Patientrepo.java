package com.abd.hospitalmgt.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import com.abd.hospitalmgt.entity.Patient;



public interface Patientrepo extends JpaRepository<Patient, Integer>{

	Patient findByUsername(String username);
}
