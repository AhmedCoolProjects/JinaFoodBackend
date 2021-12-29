package me.ahmedbargady.jinafood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.ahmedbargady.jinafood.model.Table;

public interface TableRepository extends MongoRepository<Table, String> {
    // for queries

}
