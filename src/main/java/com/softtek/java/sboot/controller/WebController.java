package com.softtek.java.sboot.controller;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.java.sboot.entity.Course;
import com.softtek.java.sboot.service.CourseService;

@Controller

public class WebController {
	
	@Autowired
	CourseService Cservice;
	
	@GetMapping("/home")
	public String gethome(Model model) {
		
		model.addAttribute("courses",Cservice.getCourse());
		
		return "index";
	}
	
	@GetMapping("/blog")
	public String getblog() {
		return "blog";
	}
	
	@GetMapping("/contact")
	public String getContact() {
		return "contact";
	}
	@GetMapping("/blog-post")
	public String getpostblog() {
		return "blog-post";
	}

}
