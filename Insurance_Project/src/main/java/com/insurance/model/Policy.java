package com.insurance.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyid;
	private String policynumber;
	private Date policyeffectivedate;
	private Date policyexpirydate;
	private String payment_option;
	private double totalamount;
	private boolean status;
	private Date createddate;
	private String additionalinfo;
	
	public Policy() {
		
	}

	public Policy(int policyid, String policynumber, Date policyeffectivedate, Date policyexpirydate,
			String payment_option, double totalamount, boolean status, Date createddate, String additionalinfo) {
		super();
		this.policyid = policyid;
		this.policynumber = policynumber;
		this.policyeffectivedate = policyeffectivedate;
		this.policyexpirydate = policyexpirydate;
		this.payment_option = payment_option;
		this.totalamount = totalamount;
		this.status = status;
		this.createddate = createddate;
		this.additionalinfo = additionalinfo;
	}

	public int getPolicyid() {
		return policyid;
	}

	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}

	public String getPolicynumber() {
		return policynumber;
	}

	public void setPolicynumber(String policynumber) {
		this.policynumber = policynumber;
	}

	public Date getPolicyeffectivedate() {
		return policyeffectivedate;
	}

	public void setPolicyeffectivedate(Date policyeffectivedate) {
		this.policyeffectivedate = policyeffectivedate;
	}

	public Date getPolicyexpirydate() {
		return policyexpirydate;
	}

	public void setPolicyexpirydate(Date policyexpirydate) {
		this.policyexpirydate = policyexpirydate;
	}

	public String getPayment_option() {
		return payment_option;
	}

	public void setPayment_option(String payment_option) {
		this.payment_option = payment_option;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getAdditionalinfo() {
		return additionalinfo;
	}

	public void setAdditionalinfo(String additionalinfo) {
		this.additionalinfo = additionalinfo;
	}

	@Override
	public String toString() {
		return "Policy [policyid=" + policyid + ", policynumber=" + policynumber + ", policyeffectivedate="
				+ policyeffectivedate + ", policyexpirydate=" + policyexpirydate + ", payment_option=" + payment_option
				+ ", totalamount=" + totalamount + ", status=" + status + ", createddate=" + createddate
				+ ", additionalinfo=" + additionalinfo + "]";
	}
	

}
