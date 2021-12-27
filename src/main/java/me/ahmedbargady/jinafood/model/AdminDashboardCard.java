package me.ahmedbargady.jinafood.model;

public class AdminDashboardCard {
	private String icon, description, title, link;

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

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

	public AdminDashboardCard(String icon, String title, String description, int number, String link) {
		super();
		this.icon = icon;
		this.link = link;
		this.title = title;
		this.description = description;
		this.number = number;
	}
}
