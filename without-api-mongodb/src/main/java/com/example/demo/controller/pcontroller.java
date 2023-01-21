package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Repository.Reppo;
import com.example.demo.model.people;

@Controller
public class pcontroller {
@Autowired

Reppo repo;
@RequestMapping("index")
public String index() {
	return "index.jsp";
}
@RequestMapping("add")
public String add(people pp) {
	repo.save(pp);
	return "success.jsp";
}
@RequestMapping("success")
public String success() {
	return "index.jsp";
}
@RequestMapping("display")
public ModelAndView display(@RequestParam int id) {
	ModelAndView mv = new ModelAndView("display.jsp");
	people pp= repo.findById(id).orElse(new people());
	mv.addObject(pp);
	return mv;
}
@RequestMapping("delete")
public ModelAndView delete(@RequestParam int id) {
	ModelAndView mv = new ModelAndView("delete.jsp");
	people pp= repo.findById(id).orElse(new people());
	repo.deleteById(id);
	mv.addObject(pp);
	return mv;
}
@RequestMapping("update")
public ModelAndView update(people pp) {
	ModelAndView mv = new ModelAndView("update.jsp");
	pp =repo.findById(pp.getId()).orElse(new people());
	mv.addObject(pp);
	return mv;
	}
}




















