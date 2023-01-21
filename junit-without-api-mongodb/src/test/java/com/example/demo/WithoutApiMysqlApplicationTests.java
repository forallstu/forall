package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repository.Reppo;
import com.example.demo.model.people;

@SpringBootTest
class WithoutApiMysqlApplicationTests {
@Autowired 

Reppo repo;

@Test
public void create() {
	people pp=new people();
	pp.setId(1);
	pp.setName("kaleem");
	repo.save(pp);
}
@Test
public void read() {
Iterable<people> List=repo.findAll();
}
@Test
public void delete() {
	repo.deleteById(1);
}
@Test
public void update() {
	people pp=repo.findById(1).get();
	pp.setName("rayyan");
	repo.save(pp);
}
}
