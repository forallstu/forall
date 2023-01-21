package com.example.demo.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.people;

public interface Reppo extends MongoRepository<people, Integer>{

}
