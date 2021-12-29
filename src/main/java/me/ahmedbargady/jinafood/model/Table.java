package me.ahmedbargady.jinafood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Table {
	@Id
	private String id;
	private int number, size, stage;
	private EmptyTable isEmpty;

	public int getNumber() {
		return number;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public EmptyTable getIsEmpty() {
		return isEmpty;
	}

	public void setIsEmpty(EmptyTable isEmpty) {
		this.isEmpty = isEmpty;
	}

	public Table(int number, int size, int stage, EmptyTable isEmpty) {
		super();
		this.number = number;
		this.size = size;
		this.stage = stage;
		this.isEmpty = isEmpty;
	}

}
