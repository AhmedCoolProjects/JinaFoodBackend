package me.ahmedbargady.jinafood.model;

public class AdminDashboardCard {
	private String icon, description, title;
	private int number;

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public AdminDashboardCard(String icon, String title, String description, int number) {
		super();
		this.icon = icon;
		this.title = title;
		this.description = description;
		this.number = number;
	}
}
