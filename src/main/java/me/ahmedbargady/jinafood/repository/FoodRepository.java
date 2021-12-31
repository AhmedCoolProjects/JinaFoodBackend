package me.ahmedbargady.jinafood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.ahmedbargady.jinafood.model.Food;

public interface FoodRepository extends MongoRepository<Food, String> {

}
