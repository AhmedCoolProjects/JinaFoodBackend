package me.ahmedbargady.jinafood.model;

public class DummyData {

	AdminDashboardCard employeesCard = new AdminDashboardCard("badge", "Employees", "description here ...", 50);
	AdminDashboardCard customersCard = new AdminDashboardCard("groups", "Customers", "description here ...", 50);
	AdminDashboardCard ordersCard = new AdminDashboardCard("list_alt", "Orders", "description here ...", 50);
	AdminDashboardCard tablesCard = new AdminDashboardCard("table_restaurant", "Tables", "description here ...", 5);
	AdminDashboardCard productsCard = new AdminDashboardCard("fastfood", "Products", "description here ...", 50);

//	public String[][] listCards = { { "badge", "Employees", "description here ...", "50" },
//			{ "groups", "Customers", "description here ...", "50" },
//			{ "list_alt", "Orders", "description here ...", "50" },
//			{ "table_restaurant", "Tables", "description here ...", "5" },
//			{ "fastfood", "Products", "description here ...", "50" } };
//	public String[] listCards = { "badge+Employees+description here ...+50", "groups+Customers+description here ...+50",
//			"list_alt+Orders+description here ...+50", "table_restaurant", "Tables", "description here ...+5",
//			"fastfood+Products+description here ...+50" };
	public AdminDashboardCard[] listCards = { employeesCard, productsCard, tablesCard, customersCard, ordersCard };

	public AdminDashboardCard[] getListCards() {
		return listCards;
	}
}
