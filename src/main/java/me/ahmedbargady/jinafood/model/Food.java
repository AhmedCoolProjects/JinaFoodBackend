package me.ahmedbargady.jinafood.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Food extends Product {
	private String[] ingredients, category;

	public String[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}

	public String[] getCategory() {
		return category;
	}

	public void setCategory(String[] category) {
		this.category = category;
	}

	public Food(String title, String description, double salePrice, double regularPrice, String[] images,
			String[] ingredients, String[] category) {
		super(title, description, salePrice, regularPrice, images);
		this.ingredients = ingredients;
		this.category = category;
	}

}
