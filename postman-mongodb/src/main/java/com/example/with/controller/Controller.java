package com.example.with.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.with.model.Model;
import com.example.with.repository.Repository;

@RestController
public class Controller {
@Autowired
Repository repo;

@PostMapping("/add")
public String add(@RequestBody Model mm) {
	repo.save(mm);
	return "Sucessfully Added"+mm.getId();
}
@GetMapping("/display")
public List<Model> display() {
	return (List<Model>) repo.findAll();
}
 
@GetMapping("/display/{id}")
public Optional<Model> display(@PathVariable int id) {
	return repo.findById(id);
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
	repo.deleteById(id);
	return "Sucessfully Deleted"+id;
}

@RequestMapping("/update/{id}")
public String update(@RequestBody Model mm) {
	Model exist=repo.findById(mm.getId()).get();
	exist.setName(mm.getName());
	repo.save(exist);
	return "Updated Sucessfully"+mm.getId();
}
}



















