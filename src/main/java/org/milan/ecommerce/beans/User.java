package org.milan.ecommerce.beans;

public class User {
	private String username;
	private String password;
	private String name;
	private String surname;
	private String role;
	private int phone;
	private String email;
	private String address;
	private String country;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	
	public User(String username, String password, String name, String surname, String role, int phone,
			String email, String address, String country) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.role = role;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.country = country;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getPhone() {
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
		switch(country){
		case "1": this.country = "Serbia"; break;
		case "2": this.country = "Croatia"; break;
		default: this.country = country; break;
	}
	}
	
	
}
