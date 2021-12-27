package me.ahmedbargady.jinafood.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ahmedbargady.jinafood.model.Product;
import me.ahmedbargady.jinafood.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	private final ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/id/{id}")
	public Optional<Product> get(@PathVariable String id) {
		return productService.get(id);
	}

	@GetMapping
	public List<Product> getall() {
		return productService.getall();
	}

	@PostMapping("/add")
	public Product add(@RequestBody Product p) {
		return productService.add(p);
	}

	@PostMapping("/add/admin")
	public String addadmin(HttpServletRequest request) {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String salePrice = request.getParameter("salePrice");
		String regularPrice = request.getParameter("regularPrice");
		String images1 = request.getParameter("images");
		String[] images = images1.split(";");

		Product p = new Product(title, description, Double.parseDouble(salePrice), Double.parseDouble(regularPrice),
				images);
		productService.add(p);
		return "admin/products";
	}

	@GetMapping("/delete/{id}")
	public String delelte(@PathVariable String id) {
		return productService.delete(id);
	}

}
