package com.abd.hospitalmgt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String gender;
	private String age;
	private String address;
	@Column(unique=true)
	private String mobile;
	private String username;
	private String password;
	private String role;
	private boolean enabled;
	
public Patient() {
		
		
	}
	
	
	public Patient(int id, String name, String gender, String age, String address, String mobile, String username,
		String password, String role, boolean enabled) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.address = address;
	this.mobile = mobile;
	this.username = username;
	this.password = password;
	this.role = role;
	this.enabled = enabled;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address
				+ ", mobile=" + mobile + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", enabled=" + enabled + "]";
	}


	
}
