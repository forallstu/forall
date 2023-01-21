package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

public interface Repo extends CrudRepository<Student, Integer>{

}
