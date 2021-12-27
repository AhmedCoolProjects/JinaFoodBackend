package me.ahmedbargady.jinafood.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import me.ahmedbargady.jinafood.model.AdminDashboardCard;
import me.ahmedbargady.jinafood.model.DummyData;
import me.ahmedbargady.jinafood.model.Product;
import me.ahmedbargady.jinafood.service.ProductService;

@Controller
@RequestMapping("/api/v1/admin")
public class AdminController {

	private final ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	public AdminController(ProductService productService) {
		super();
		this.productService = productService;
	}

	DummyData dummyData = new DummyData();
	AdminDashboardCard[] listCards = dummyData.getListCards();

	@GetMapping
	public String admin(Model model) {
		model.addAttribute("cardsData", listCards);
		model.addAttribute("title", "Dashboard");
		return "admin/index";
	}

	@GetMapping("/products")
	public String products(Model model) {

		model.addAttribute("title", "Products");
		model.addAttribute("products", productService.getall());
		return "admin/products";
	}

	@PostMapping("/products")
	public void products(HttpServletRequest request, HttpServletResponse response) {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String salePrice = request.getParameter("salePrice");
		String regularPrice = request.getParameter("regularPrice");
		String images1 = request.getParameter("images");
		String[] images = images1.split(";");
		Product p = new Product(title, description, Double.parseDouble(salePrice), Double.parseDouble(regularPrice),
				images);
		productService.add(p);
		try {
			response.sendRedirect("/api/v1/admin/products");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/products/delete/{id}")
	public void deleteProduct(HttpServletResponse response, @PathVariable String id) {
		productService.delete(id);
		try {
			response.sendRedirect("/api/v1/admin/products");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/orders")
	public String orders(Model model) {
		model.addAttribute("title", "Orders");
		return "admin/orders";
	}

	@GetMapping("/employees")
	public String employees(Model model) {
		model.addAttribute("title", "Employees");
		return "admin/employees";
	}

	@GetMapping("/customers")
	public String customers(Model model) {
		model.addAttribute("title", "Customers");
		return "admin/customers";
	}

	@GetMapping("/tables")
	public String tables(Model model) {
		model.addAttribute("title", "Tables");
		return "admin/tables";
	}
}
