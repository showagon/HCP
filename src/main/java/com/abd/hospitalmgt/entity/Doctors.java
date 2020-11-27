package com.abd.hospitalmgt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctors {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String dept;
	private int experience;
	private int fee;
	private int flag;
	
	public Doctors()
	{
		
	}
	
	public Doctors(String name, String dept, int experience, int fee, int flag) {
		super();
		this.name = name;
		this.dept = dept;
		this.experience = experience;
		this.fee = fee;
		this.flag = flag;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Doctors [id=" + id + ", name=" + name + ", dept=" + dept + ", experience=" + experience + ", fee=" + fee
				+ ", flag=" + flag + "]";
	}
	
	
	
	
	

	
}
