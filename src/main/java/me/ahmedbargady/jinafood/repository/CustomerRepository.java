package me.ahmedbargady.jinafood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.ahmedbargady.jinafood.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
//	for queries

}
