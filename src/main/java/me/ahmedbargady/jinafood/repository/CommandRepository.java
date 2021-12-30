package me.ahmedbargady.jinafood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.ahmedbargady.jinafood.model.Command;

public interface CommandRepository extends MongoRepository<Command, String> {

}
