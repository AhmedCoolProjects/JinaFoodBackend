package me.ahmedbargady.jinafood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import me.ahmedbargady.jinafood.model.Customer;
import me.ahmedbargady.jinafood.repository.CustomerRepository;

@AllArgsConstructor
@Service
public class CustomerService {

	@Autowired
	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;

	}

	public Optional<Customer> get(String id) {
		return customerRepository.findById(id);
	}

	public List<Customer> getall() {
		return customerRepository.findAll();
	}

	public Customer add(Customer c) {
		return customerRepository.save(c);
	}

	public String delete(String id) {
		customerRepository.deleteById(id);
		return "Deleted";
	}

	public Customer update(Customer c) {
		return customerRepository.save(c);
	}

}
