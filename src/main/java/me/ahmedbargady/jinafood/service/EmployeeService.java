package me.ahmedbargady.jinafood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ahmedbargady.jinafood.model.Employee;
import me.ahmedbargady.jinafood.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private final EmployeeRepository employeeRepository;

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public Optional<Employee> get(String id) {
		return employeeRepository.findById(id);
	}

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getall() {
		return employeeRepository.findAll();
	}

	public Employee add(Employee e) {
		return employeeRepository.save(e);
	}

	public String delete(String id) {
		employeeRepository.deleteById(id);
		return "Done";

	}
}
