package org.milan.ecommerce.beans;

public class Review {
	private String id;
	private String user;
	private String date;
	private double rating;
	private String comment;
	
	public Review() {
		this.id = new String();
		this.user = new String();
		this.date = new String();
		this.rating = -1;
		this.comment = new String();
	}

	public Review(String id, String user, String date, double rating, String comment) {
		super();
		this.id = id;
		this.user = user;
		this.date = date;
		this.rating = rating;
		this.comment = comment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}

