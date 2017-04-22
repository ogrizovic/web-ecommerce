package org.milan.ecommerce.beans;
import java.util.ArrayList;

public class Store {
	private String id;
	private String name;
	private String address;
	private String country;
	private int phone;
	private String email;
	private String seller;
	private double rating;
	private ArrayList<String> reviews;
	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(String id, String name, String address, String country, int phone, String email, String seller,
			float rating, ArrayList<String> reviews) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.country = country;
		this.phone = phone;
		this.email = email;
		this.seller = seller;
		this.rating = rating;
		this.reviews = reviews;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Number getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Number getRating() {
		return rating;
	}

	public void setRating(double d) {
		this.rating = d;
	}

	public ArrayList<String> getReviews() {
		return reviews;
	}

	public void setReviews(ArrayList<String> reviews) {
		this.reviews = reviews;
	}

	
	
	
}

