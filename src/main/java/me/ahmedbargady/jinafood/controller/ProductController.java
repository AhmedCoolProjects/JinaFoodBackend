package me.ahmedbargady.jinafood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ahmedbargady.jinafood.model.Product;
import me.ahmedbargady.jinafood.service.ProductService;

@RestController
@CrossOrigin(origins = "https://jinafood.vercel.app")
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

	@PostMapping("/update")
	public Product update(@RequestBody Product p) {
		return productService.update(p);
	}

	@GetMapping("/delete/{id}")
	public String delelte(@PathVariable String id) {
		return productService.delete(id);
	}

}
