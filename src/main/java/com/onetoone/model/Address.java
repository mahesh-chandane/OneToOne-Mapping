package com.onetoone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int address_id;
	private String address_name;
	private String pincode;
	
	
	public int getAddress_id() {
		return address_id;
	}
	/**
	 * @param address_id the address_id to set
	 */
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	/**
	 * @return the address_name
	 */
	public String getAddress_name() {
		return address_name;
	}
	/**
	 * @param address_name the address_name to set
	 */
	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}
	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(int address_id, String address_name, String pincode) {
		super();
		this.address_id = address_id;
		this.address_name = address_name;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
