package com.insurance.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String city;
	private String nationality;
	private String password;
	private String gender;
	private String pancard;
	private String mobileno;
	private int age;
	@OneToMany(mappedBy = "userid")
	private List<Claim> claimList;
	@OneToMany(mappedBy = "userid")
	private List<Premium> premiumList;
	
	public User() {
		
	}

	public User(int id, String firstname, String lastname, String email, String city, String nationality,
			String password, String gender, String pancard, String mobileno, int age, List<Claim> claimList,
			List<Premium> premiumList) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
		this.nationality = nationality;
		this.password = password;
		this.gender = gender;
		this.pancard = pancard;
		this.mobileno = mobileno;
		this.age = age;
		this.claimList = claimList;
		this.premiumList = premiumList;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public List<Claim> getClaimList() {
		return claimList;
	}
	public void setClaimList(List<Claim> claimList) {
		this.claimList = claimList;
	}
	public List<Premium> getPremiumList() {
		return premiumList;
	}
	public void setPremiumList(List<Premium> premiumList) {
		this.premiumList = premiumList;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", city="
				+ city + ", nationality=" + nationality + ", password=" + password + ", gender=" + gender + ", pancard="
				+ pancard + ", mobileno=" + mobileno + ", age=" + age + ", claimList=" + claimList + ", premiumList="
				+ premiumList + "]";
	}

}