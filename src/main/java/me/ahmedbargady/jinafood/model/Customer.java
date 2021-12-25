package me.ahmedbargady.jinafood.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer extends Person {
	private String adress;

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Customer(String first_name, String last_name, String email, String phone, String title, Gender gender,
			String adress) {
		super(first_name, last_name, email, phone, title, gender);
		this.adress = adress;
	}

}
