package me.ahmedbargady.jinafood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Command {
	@Id
	private String id;

	private String foodId, customerId;
	private int count;
	private double totalPrice;

	public String getFoodId() {
		return foodId;
	}

	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	public String getId() {
		return id;
	}

	public void setFood(String foodId) {
		this.foodId = foodId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Command(String foodId, int count, double totalPrice, String customerId) {
		super();
		this.foodId = foodId;
		this.count = count;
		this.totalPrice = totalPrice;
		this.customerId = customerId;
	}

}
