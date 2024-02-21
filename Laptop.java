package com.testHibernate.HibernateTest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laptop")
public class Laptop {
	@Id
	private int id;
	private String brand;
	private int price;
	
	//setter and getters for the data-members
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop[id="+id+",brand="+brand+",price="+price+"]";
	}
}
