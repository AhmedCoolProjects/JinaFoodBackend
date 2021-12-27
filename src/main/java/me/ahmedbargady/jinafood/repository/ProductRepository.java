package me.ahmedbargady.jinafood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.ahmedbargady.jinafood.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
