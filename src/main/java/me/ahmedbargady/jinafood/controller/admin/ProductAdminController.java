package me.ahmedbargady.jinafood.controller.admin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ahmedbargady.jinafood.model.Product;
import me.ahmedbargady.jinafood.service.ProductService;

@Controller
@RequestMapping("/api/v1/admin/products")
public class ProductAdminController {
	private final ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	public ProductAdminController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping
	public String products(Model model) {
		model.addAttribute("title", "Products");
		model.addAttribute("products", productService.getall());
		return "admin/products";
	}

	@PostMapping
	public void addProduct(HttpServletRequest request, HttpServletResponse response) {
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

	@PostMapping("/update/{id}")
	public void updateProduct(HttpServletRequest request, HttpServletResponse response, @PathVariable String id) {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String salePrice = request.getParameter("salePrice");
		String regularPrice = request.getParameter("regularPrice");
		String images1 = request.getParameter("images");
		String[] images = images1.split(";");
		Product p = new Product(title, description, Double.parseDouble(salePrice), Double.parseDouble(regularPrice),
				images);
		p.setId(id);
		productService.add(p);
		try {
			response.sendRedirect("/api/v1/admin/products");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/delete/{id}")
	public void deleteProduct(HttpServletResponse response, @PathVariable String id) {
		productService.delete(id);
		try {
			response.sendRedirect("/api/v1/admin/products");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
