package org.milan.ecommerce.services;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.milan.ecommerce.beans.Category;
import org.milan.ecommerce.beans.Courier;
import org.milan.ecommerce.beans.Item;
import org.milan.ecommerce.beans.Purchase;
import org.milan.ecommerce.beans.Review;
import org.milan.ecommerce.beans.Store;
import org.milan.ecommerce.beans.User;
import org.milan.ecommerce.parser.json.*;


public class Parser {
	
	public Parser() {
		// TODO Auto-generated constructor stub
	}
	
	public HashMap<String, Purchase> readPurchases(String realPath) {
		BufferedReader in = null;
		HashMap<String, Purchase> purchases = new HashMap<>();
		try {
			in = new BufferedReader(new FileReader(realPath + "/beans_purchases.json"));
		
			JSONTokener tokener = new JSONTokener(in);
			JSONArray ja = new JSONArray(tokener);
			in.close();
			
			for (int i = 0; i<ja.length(); i++){
				Purchase prc = new Purchase();
				JSONObject json_prc = (JSONObject) ja.get(i);
				
				prc.setId((String)json_prc.get("id"));
				prc.setBuyer((String)json_prc.get("buyer"));
				prc.setStore((String)json_prc.get("store"));
				JSONArray json_itms = json_prc.getJSONArray("items");
				for (int j = 0; j<json_itms.length(); j++){
					prc.getItems().add(json_itms.getString(j));
				}
				prc.setCourier((String)json_prc.get("courier"));
				prc.setShippingDays((int)json_prc.get("shipping-days"));
				prc.setShippingPrice((double)json_prc.get("shipping-price"));
				prc.setTotalPrice((double)json_prc.get("total-price"));

				purchases.put(prc.getId(), prc);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return purchases;
	}

	public HashMap<String, Item> readItems(String realPath) {
		BufferedReader in = null;
		HashMap<String, Item> items = new HashMap<>();
		try {
			in = new BufferedReader(new FileReader(realPath + "/beans_items.json"));
		
			JSONTokener tokener = new JSONTokener(in);
			JSONArray ja = new JSONArray(tokener);
			in.close();
			
			for (int i = 0; i<ja.length(); i++){
				Item itm = new Item();
				JSONObject json_itm = (JSONObject) ja.get(i);
				
				itm.setId((String)json_itm.get("id"));
				itm.setName((String)json_itm.get("name"));
				itm.setColour((String)json_itm.get("colour"));
				itm.setDimensions((String)json_itm.get("dimensions"));
				itm.setWeight((String)json_itm.get("weight"));
				itm.setCountryOfOrigin((String)json_itm.get("country-of-origin"));
				itm.setManufacturer((String)json_itm.get("manufacturer"));
				itm.setPrice((double)json_itm.get("price"));
				itm.setCategory((String)json_itm.get("category"));
				JSONArray json_imgs = json_itm.getJSONArray("images");
				for (int j = 0; j<json_imgs.length(); j++){
					itm.getImages().add(json_imgs.getString(j));
				}
				itm.setVideo((String)json_itm.get("video"));
				itm.setRating((double)json_itm.get("rating"));
				JSONArray json_revs = json_itm.getJSONArray("reviews");
				for (int j = 0; j<json_revs.length(); j++){
					itm.getReviews().add(json_revs.getString(j));
				}
				itm.setInStock((int)json_itm.get("in-stock"));

				items.put(itm.getId(), itm);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items;
	}

	public HashMap<String, Review> readReviews(String realPath) {
		BufferedReader in = null;
		HashMap<String, Review> reviews = new HashMap<>();
		try {
			in = new BufferedReader(new FileReader(realPath + "/beans_reviews.json"));
		
			JSONTokener tokener = new JSONTokener(in);
			JSONArray ja = new JSONArray(tokener);
			in.close();
			
			for (int i = 0; i<ja.length(); i++){
				Review rv = new Review();
				JSONObject json_rv = ja.getJSONObject(i);
				
				rv.setId(json_rv.getString("id"));
				rv.setUser(json_rv.getString("user"));
				rv.setDate(json_rv.getString("date"));
				rv.setRating(json_rv.getDouble("rating"));
				rv.setComment(json_rv.getString("comment"));

				reviews.put(rv.getId(), rv);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reviews;
	}

	public HashMap<String, Courier> readCouriers(String realPath) {
		BufferedReader in = null;
		HashMap<String, Courier> couriers = new HashMap<>();
		try {
			in = new BufferedReader(new FileReader(realPath + "/beans_couriers.json"));
		
			JSONTokener tokener = new JSONTokener(in);
			JSONArray ja = new JSONArray(tokener);
			in.close();
			
			for (int i = 0; i<ja.length(); i++){
				Courier crr = new Courier();
				JSONObject json_crr = ja.getJSONObject(i);
				
				crr.setId(json_crr.getString("id"));
				crr.setName(json_crr.getString("name"));
				crr.setDescription(json_crr.getString("description"));
				crr.setPrice(json_crr.getDouble("price"));
			
				JSONArray json_sc = json_crr.getJSONArray("shipping-countries");
				for (int j = 0; j<json_sc.length(); j++){
					crr.getShippingCountries().add(json_sc.getString(j));
				}

				couriers.put(crr.getId(), crr);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return couriers;
	}

	public HashMap<String, Store> readStores(String realPath) {
		BufferedReader in = null;
		HashMap<String, Store> stores = new HashMap<>();
		try {
			in = new BufferedReader(new FileReader(realPath + "/beans_stores.json"));
		
			JSONTokener tokener = new JSONTokener(in);
			JSONArray ja = new JSONArray(tokener);
			in.close();
			
			for (int i = 0; i<ja.length(); i++){
				Store str = new Store();
				JSONObject json_str = ja.getJSONObject(i);
				
				str.setId(json_str.getString("id"));
				str.setName(json_str.getString("name"));
				str.setAddress(json_str.getString("address"));
				str.setCountry(json_str.getString("country"));
				str.setPhone(json_str.getInt("phone"));
				str.setEmail(json_str.getString("email"));
				str.setSeller(json_str.getString("seller"));
				str.setRating(json_str.getDouble("rating"));
				JSONArray json_revs = json_str.getJSONArray("reviews");
				for (int j = 0; j<json_revs.length(); j++){
					str.getReviews().add(json_revs.getString(j));
				}

				stores.put(str.getId(), str);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stores;
	}

	public HashMap<String, Category> readCategories(String realPath) {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		HashMap<String, Category> categories = new HashMap<>();
		try {
			in = new BufferedReader(new FileReader(realPath + "/beans_categories.json"));
		
			JSONTokener tokener = new JSONTokener(in);
			JSONArray ja = new JSONArray(tokener);
			in.close();
			
			for (int i = 0; i<ja.length(); i++){
				Category ctg = new Category();
				JSONObject json_ctg = ja.getJSONObject(i);
				
				ctg.setName(json_ctg.getString("name"));
				ctg.setDescription(json_ctg.getString("description"));
				JSONArray json_subcs = json_ctg.getJSONArray("subcategories");
				for (int j = 0; j<json_subcs.length(); j++){
					ctg.getSubcategories().add(json_subcs.getString(j));
				}
				ctg.setParentCategory(json_ctg.getString("parent-category"));

				categories.put(ctg.getName(), ctg);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categories;
	}

	public HashMap<String, User> readUsers(String realPath) {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		HashMap<String, User> users = new HashMap<>();
		try {
			in = new BufferedReader(new FileReader(realPath + "/beans_users.json"));
			JSONTokener tokener = new JSONTokener(in);
			JSONArray ja = new JSONArray(tokener);
			in.close();
			
			for (int i = 0; i < ja.length(); i++){
				JSONObject json_user = ja.getJSONObject(i);
				
				User user = new User();
				
				user.setUsername(json_user.getString("username"));
				user.setPassword(json_user.getString("password"));
				user.setName(json_user.getString("name"));
				user.setSurname(json_user.getString("surname"));
				user.setRole(json_user.getString("role"));
				user.setPhone(json_user.getInt("phone"));
				user.setEmail(json_user.getString("email"));
				user.setAddress(json_user.getString("address"));
				user.setCountry(json_user.getString("country"));
				
				users.put(user.getUsername(), user);
				
			}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return users;
	}
	
}

