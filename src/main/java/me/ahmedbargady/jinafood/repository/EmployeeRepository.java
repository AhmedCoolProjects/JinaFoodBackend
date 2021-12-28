package me.ahmedbargady.jinafood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.ahmedbargady.jinafood.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
