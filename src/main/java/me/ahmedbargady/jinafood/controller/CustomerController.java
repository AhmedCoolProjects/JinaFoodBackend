package me.ahmedbargady.jinafood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ahmedbargady.jinafood.model.Customer;
import me.ahmedbargady.jinafood.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

	private final CustomerService customerService;

	public CustomerService getCustomerService() {
		return customerService;
	}

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/id/{id}")
	public Optional<Customer> get(@PathVariable String id) {
		return customerService.get(id);
	}

	@GetMapping
	public List<Customer> getall() {
		return customerService.getall();
	}

	@PostMapping("/add")
	public Customer add(@RequestBody Customer c) {
		return customerService.add(c);
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable String id) {
		return customerService.delete(id);
	}

}
