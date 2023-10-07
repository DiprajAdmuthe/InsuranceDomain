package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim")
public class Claim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String claimid;
	private String policyid;
	private String claimstatus;
	private String claimamount;
	private Integer userid;
	
	public Claim() {
		
	}

	public Claim(int id, String claimid, String policyid, String claimstatus, String claimamount, Integer userid) {
		super();
		this.id = id;
		this.claimid = claimid;
		this.policyid = policyid;
		this.claimstatus = claimstatus;
		this.claimamount = claimamount;
		this.userid = userid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaimid() {
		return claimid;
	}

	public void setClaimid(String claimid) {
		this.claimid = claimid;
	}

	public String getPolicyid() {
		return policyid;
	}

	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}

	public String getClaimstatus() {
		return claimstatus;
	}

	public void setClaimstatus(String claimstatus) {
		this.claimstatus = claimstatus;
	}

	public String getClaimamount() {
		return claimamount;
	}

	public void setClaimamount(String claimamount) {
		this.claimamount = claimamount;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Claim [id=" + id + ", claimid=" + claimid + ", policyid=" + policyid + ", claimstatus=" + claimstatus
				+ ", claimamount=" + claimamount + ", userid=" + userid + "]";
	}

}
