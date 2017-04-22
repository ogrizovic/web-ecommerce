package org.milan.ecommerce.beans;
import java.util.ArrayList;

public class Courier {
	private String id;
	private String name;
	private String description;
	private ArrayList<String> shippingCountries;
	private double price; // price per 100km npr
	
	public Courier() {
		// TODO Auto-generated constructor stub
	}

	public Courier(String id, String name, String description, ArrayList<String> shippingCountries, float price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.shippingCountries = shippingCountries;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getShippingCountries() {
		return shippingCountries;
	}

	public void setShippingCountries(ArrayList<String> shippingCountries) {
		this.shippingCountries = shippingCountries;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
