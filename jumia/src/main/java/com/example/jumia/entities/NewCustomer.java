package com.example.jumia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class NewCustomer{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	private String phone;
	private String country;
	private Boolean valid;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "NewCustomer [name=" + name + ", phone=" + phone + ", country=" + country + ", valid=" + valid + "]";
	}
	public NewCustomer(String name, String phone, String country, Boolean valid) {
		super();
		this.name = name;
		this.phone = phone;
		this.country = country;
		this.valid = valid;
	}
	


	
	
	
	
	

}
