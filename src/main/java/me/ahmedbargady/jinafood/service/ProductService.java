package me.ahmedbargady.jinafood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ahmedbargady.jinafood.model.Product;
import me.ahmedbargady.jinafood.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public Optional<Product> get(String id) {
		return productRepository.findById(id);
	}

	public List<Product> getall() {
		return productRepository.findAll();
	}

	public Product add(Product p) {
		return productRepository.save(p);
	}

	public String delete(String id) {
		productRepository.deleteById(id);
		return "Done";
	}

}
