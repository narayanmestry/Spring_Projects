package com.bridgelabz.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name = "user_info")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;
	@Column(name = "mob_no")
	private long mobileNo;
	@Column(name = "joined_date")
	private Date joined;
	@Column(name = "expiry_date")
	private Date modified;
	@Column(name = "verify")
	private int verify;


	public User() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Date getJoined() {
		return joined;
	}


	public void setJoined(Date joined) {
		this.joined = joined;
	}


	public Date getModified() {
		return modified;
	}


	public void setModified(Date modified) {
		this.modified = modified;
	}


	public int getVerify() {
		return verify;
	}


	public void setVerify(int verify) {
		this.verify = verify;
	}


	public String toString()
	{
		return getId()+" "+getUserName()+" "+getPassword()+" "+getAddress()+" "+getMobileNo()+" "+getJoined()+" "+getVerify()+" "+getEmail();
	}
	
	
	
	

}
