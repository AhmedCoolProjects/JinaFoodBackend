package me.ahmedbargady.jinafood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.ahmedbargady.jinafood.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
    // for queries

}
