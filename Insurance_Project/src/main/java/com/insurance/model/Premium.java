package com.insurance.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="premium")
public class Premium {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int premiumid;
	private int policyid;
	private String policyholdername;
	private double installmentpremium;
	private Date policycommencementdate;
	private int userid;
	
	public Premium() {
		
	}

	public Premium(int id, int premiumid, int policyid, String policyholdername, double installmentpremium,
			Date policycommencementdate, int userid) {
		super();
		this.id = id;
		this.premiumid = premiumid;
		this.policyid = policyid;
		this.policyholdername = policyholdername;
		this.installmentpremium = installmentpremium;
		this.policycommencementdate = policycommencementdate;
		this.userid = userid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPremiumid() {
		return premiumid;
	}

	public void setPremiumid(int premiumid) {
		this.premiumid = premiumid;
	}

	public int getPolicyid() {
		return policyid;
	}

	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}

	public String getPolicyholdername() {
		return policyholdername;
	}

	public void setPolicyholdername(String policyholdername) {
		this.policyholdername = policyholdername;
	}

	public double getInstallmentpremium() {
		return installmentpremium;
	}

	public void setInstallmentpremium(double installmentpremium) {
		this.installmentpremium = installmentpremium;
	}

	public Date getPolicycommencementdate() {
		return policycommencementdate;
	}

	public void setPolicycommencementdate(Date policycommencementdate) {
		this.policycommencementdate = policycommencementdate;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Premium [id=" + id + ", premiumid=" + premiumid + ", policyid=" + policyid + ", policyholdername="
				+ policyholdername + ", installmentpremium=" + installmentpremium + ", policycommencementdate="
				+ policycommencementdate + ", userid=" + userid + "]";
	}
	

}
