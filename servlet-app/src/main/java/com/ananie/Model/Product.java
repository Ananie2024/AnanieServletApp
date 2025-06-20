package com.ananie.Model;

public class Product {
	private int id;
	private double price;
	private String name;
	public Product(int id, double price,String name) {
		this.id=id;
		this.price=price;
		this.name=name;
	}
	
 // let's provide setters
public void setId(int id) { this.id=id;}
public void setPrice(double price) { this.price=price;}
public void setName(String name) { this.name=name;}
// let's provide getters
public int getId() { return id;}
public double getPrice() { return price;}
public String getName() { return name; }

} 
