package com.springrest.springrest.controller;

import com.springrest.springrest.entity.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Mycontroller {
	@GetMapping("/home")
	public String home() {
		return "welcome to my project work";
		// TODO Auto-generated constructor stub
	}

	//get the courses

 {
		
 }
}