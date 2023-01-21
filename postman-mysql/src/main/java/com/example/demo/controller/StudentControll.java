package com.example.demo.controller;

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

import com.example.demo.Repository.Repo;
import com.example.demo.model.Student;

@RestController
public class StudentControll {
@Autowired

Repo repo;

@PostMapping("/addstu")
public String add(@RequestBody Student stu) {
	repo.save(stu);
	return "record added"+stu.getId();
}
@GetMapping("/display")
public List<Student> display(){
	return (List<Student>) repo.findAll();
}
@GetMapping("/search/{id}")
public Optional<Student> search(@PathVariable int id){
	return repo.findById(id);
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
	repo.deleteById(id);
	return "record deleted"+id;
}
@RequestMapping("/update/{id}")
public String update(@RequestBody Student stu) {
	Student exist=repo.findById(stu.getId()).get();
	exist.setName(stu.getName());
	repo.save(exist);
	return "updated record"+stu.getId();
}
}



























