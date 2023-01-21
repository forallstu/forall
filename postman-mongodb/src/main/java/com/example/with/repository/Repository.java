package com.example.with.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.with.model.Model;

public interface Repository extends MongoRepository<Model, Integer> {

}
