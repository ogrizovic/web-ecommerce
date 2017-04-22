package org.milan.ecommerce.beans;

import java.util.ArrayList;

public class Item {
	private String id;
	private String name;
	private String colour;
	private String dimensions;
	private String weight;
	private String countryOfOrigin;
	private String manufacturer;
	private double price;
	private String category;
	private ArrayList<String> images;
	private String video;
	private double rating;
	private ArrayList<String> reviews;
	private int inStock;
	
	public Item() {
		this.id = new String();
		this.name = new String();
		this.colour = new String();
		this.dimensions = new String();
		this.weight = new String();
		this.countryOfOrigin = new String();
		this.manufacturer = new String();
		this.price = -1;
		this.category = new String();
		this.images = new ArrayList<>();
		this.video = new String();
		this.rating = -1;
		this.reviews = new ArrayList<>();
		this.inStock = -1;
	}

	public Item(String id, String name, String colour, String dimensions, String weight, String countryOfOrigin,
			String manufacturer, int price, String category, ArrayList<String> images, String video, double rating,
			ArrayList<String> reviews, int inStock) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.dimensions = dimensions;
		this.weight = weight;
		this.countryOfOrigin = countryOfOrigin;
		this.manufacturer = manufacturer;
		this.price = price;
		this.category = category;
		this.images = images;
		this.video = video;
		this.rating = rating;
		this.reviews = reviews;
		this.inStock = inStock;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ArrayList<String> getImages() {
		return images;
	}

	public void setImages(ArrayList<String> images) {
		this.images = images;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<String> getReviews() {
		return reviews;
	}

	public void setReviews(ArrayList<String> reviews) {
		this.reviews = reviews;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	
	
	
}
