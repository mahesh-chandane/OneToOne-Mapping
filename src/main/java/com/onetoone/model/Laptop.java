package com.onetoone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int laptop_id;
	private String model;
	private String brand;
	/**
	 * @return the laptop_id
	 */
	public int getLaptop_id() {
		return laptop_id;
	}
	/**
	 * @param laptop_id the laptop_id to set
	 */
	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Laptop(int laptop_id, String model, String brand) {
		super();
		this.laptop_id = laptop_id;
		this.model = model;
		this.brand = brand;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
