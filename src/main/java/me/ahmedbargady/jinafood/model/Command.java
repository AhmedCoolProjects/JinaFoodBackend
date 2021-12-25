package me.ahmedbargady.jinafood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Command {
	@Id
	private String id;
	private Food food;
	private int count;
	private double totalPrice;

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
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

	public Command(Food food, int count, double totalPrice) {
		super();
		this.food = food;
		this.count = count;
		this.totalPrice = totalPrice;
	}

}
