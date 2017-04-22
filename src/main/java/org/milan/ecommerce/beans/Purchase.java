package org.milan.ecommerce.beans;
import java.util.ArrayList;

public class Purchase {
	private String id;
	private String buyer;
	private String store;
	private ArrayList<String> items;
	private String courier;
	private int shippingDays;
	private double shippingPrice;
	private double totalPrice;
	
	public Purchase() {
		// TODO Auto-generated constructor stub
	}

	public Purchase(String id, String buyer, String store, ArrayList<String> items, String courier, int shippingDays,
			double shippingPrice, double totalPrice) {
		super();
		this.id = id;
		this.buyer = buyer;
		this.store = store;
		this.items = items;
		this.courier = courier;
		this.shippingDays = shippingDays;
		this.shippingPrice = shippingPrice;
		this.totalPrice = totalPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public ArrayList<String> getItems() {
		return items;
	}

	public void setItems(ArrayList<String> items) {
		this.items = items;
	}

	public String getCourier() {
		return courier;
	}

	public void setCourier(String courier) {
		this.courier = courier;
	}

	public int getShippingDays() {
		return shippingDays;
	}

	public void setShippingDays(int shippingDays) {
		this.shippingDays = shippingDays;
	}

	public double getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
