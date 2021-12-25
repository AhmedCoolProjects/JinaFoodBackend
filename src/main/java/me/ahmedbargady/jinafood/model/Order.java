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
	private Customer customer;
	private boolean isDelievred;

	public Command[] getCommands() {
		return commands;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isDelievred() {
		return isDelievred;
	}

	public void setDelievred(boolean isDelievred) {
		this.isDelievred = isDelievred;
	}

	public Order(Command[] commands, double totalPrice, LocalDate date, Customer customer, boolean isDelievred) {
		super();
		this.commands = commands;
		this.totalPrice = totalPrice;
		this.date = date;
		this.customer = customer;
		this.isDelievred = isDelievred;
	}

}
