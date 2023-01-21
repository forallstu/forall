package com.example.demo.secontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ss {
@GetMapping("/")
public String welcom() {
	return ("<h1> Welcome Kaleem </h1>");
}
}
