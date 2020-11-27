package com.abd.hospitalmgt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String pname;
	private String dname;
	private int fee;
	private String appdate;
	private String apptime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getAppdate() {
		return appdate;
	}
	public void setAppdate(String appdate) {
		this.appdate = appdate;
	}
	public String getApptime() {
		return apptime;
	}
	public void setApptime(String apptime) {
		this.apptime = apptime;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", pname=" + pname + ", dname=" + dname + ", fee=" + fee + ", appdate="
				+ appdate + ", apptime=" + apptime + "]";
	}
	
	
	
	
}
