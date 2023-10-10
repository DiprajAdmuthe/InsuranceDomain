package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policyschedule")
public class PolicySchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int srno;
	private String policyname;
	private String planname;
	private String username;
	private double premiumamount;
	
	private PolicySchedule() {
		
	}

	public PolicySchedule(int srno, String policyname, String planname, String username, double premiumamount) {
		super();
		this.srno = srno;
		this.policyname = policyname;
		this.planname = planname;
		this.username = username;
		this.premiumamount = premiumamount;
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getPremiumamount() {
		return premiumamount;
	}

	public void setPremiumamount(double premiumamount) {
		this.premiumamount = premiumamount;
	}

	@Override
	public String toString() {
		return "PolicySchedule [srno=" + srno + ", policyname=" + policyname + ", planname=" + planname + ", username="
				+ username + ", premiumamount=" + premiumamount + "]";
	}
	
}
