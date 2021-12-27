package me.ahmedbargady.jinafood.model;

public class DummyData {

	AdminDashboardCard employeesCard = new AdminDashboardCard("badge", "Employees", "description here ...", 50,
			"/api/v1/admin/employees");
	AdminDashboardCard customersCard = new AdminDashboardCard("groups", "Customers", "description here ...", 50,
			"/api/v1/admin/customers");
	AdminDashboardCard ordersCard = new AdminDashboardCard("list_alt", "Orders", "description here ...", 50,
			"/api/v1/admin/orders");
	AdminDashboardCard tablesCard = new AdminDashboardCard("table_restaurant", "Tables", "description here ...", 5,
			"/api/v1/admin/tables");
	AdminDashboardCard productsCard = new AdminDashboardCard("fastfood", "Products", "description here ...", 50,
			"/api/v1/admin/products");

	public AdminDashboardCard[] listCards = { employeesCard, productsCard, tablesCard, customersCard, ordersCard };

	public AdminDashboardCard[] getListCards() {
		return listCards;
	}
}
