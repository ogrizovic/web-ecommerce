package org.milan.ecommerce.beans;

import java.util.ArrayList;

public class Category {
	private String name;
	private String description;
	private ArrayList<String> subcategories;
	private String parentCategoryName;
	
	public Category() {
		// TODO Auto-generated constructor stub
		this.name = new String();
		this.description = new String();
		this.subcategories = new ArrayList<>();
		this.parentCategoryName = new String();
	}

	public Category(String name, String description, ArrayList<String> subcategories, String parentCategory) {
		super();
		this.name = name;
		this.description = description;
		this.subcategories = subcategories;
		this.parentCategoryName = parentCategory;
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

	public ArrayList<String> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(ArrayList<String> subcategories) {
		this.subcategories = subcategories;
	}

	public String getParentCategory() {
		return parentCategoryName;
	}

	public void setParentCategory(String parentCategory) {
		this.parentCategoryName = parentCategory;
	}
	
	
}
