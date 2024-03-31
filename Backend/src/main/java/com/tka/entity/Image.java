package com.tka.entity;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int addressId;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob
	public byte[] imagedata;
	
	String firstname;
	String lastname;
	String emailid;
	long mobno;
	int age;
	String state;
	String country;
	String tag;
	
	
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Image(int addressId, Date addedDate, byte[] imagedata, String firstname, String lastname, String emailid,
			long mobno, int age, String state, String country, String tage) {
		super();
		this.addressId = addressId;
		this.addedDate = addedDate;
		this.imagedata = imagedata;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.mobno = mobno;
		this.age = age;
		this.state = state;
		this.country = country;
		this.tag = tag;
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public Date getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}


	public byte[] getImagedata() {
		return imagedata;
	}


	public void setImagedata(byte[] imagedata) {
		this.imagedata = imagedata;
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


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public long getMobno() {
		return mobno;
	}


	public void setMobno(long mobno) {
		this.mobno = mobno;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getTag() {
		return tag;
	}


	public void setTag(String tage) {
		this.tag = tag;
	}

	


	

}
