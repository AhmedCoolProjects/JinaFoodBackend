package me.ahmedbargady.jinafood.model;

import org.springframework.data.annotation.Id;

public class Product {
	@Id
	private String id;

	public String getId() {
		return id;
	}

	private String title, description;
	private double salePrice, regularPrice;
	private String[] images;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public Product(String title, String description, double salePrice, double regularPrice, String[] images) {
		super();
		this.title = title;
		this.description = description;
		this.salePrice = salePrice;
		this.regularPrice = regularPrice;
		this.images = images;
	}

}
