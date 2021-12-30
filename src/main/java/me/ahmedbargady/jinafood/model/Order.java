package me.ahmedbargady.jinafood.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
	@Id
	private String id;
	private Command[] commands;
	private double totalPrice;
	private LocalDate date;
	private String customerId;
	private boolean isDelievred;

	public Command[] getCommands() {
		return commands;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setCommands(Command[] commands) {
		this.commands = commands;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public boolean isDelievred() {
		return isDelievred;
	}

	public void setDelievred(boolean isDelievred) {
		this.isDelievred = isDelievred;
	}

	public Order(Command[] commands, double totalPrice, LocalDate date, String customerId, boolean isDelievred) {
		super();
		this.commands = commands;
		this.totalPrice = totalPrice;
		this.date = date;
		this.customerId = customerId;
		this.isDelievred = isDelievred;
	}

}
