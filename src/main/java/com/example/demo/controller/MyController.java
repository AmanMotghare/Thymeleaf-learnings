package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;

@Controller
public class MyController {
	
	@RequestMapping("/test1")
	@ResponseBody
	String fun1() {
		
		return "I am fun 1.";
	}
	
	@RequestMapping("/test2")
	String fun2() {
		return "page1";
	}
	
	@RequestMapping("/test3")
	String fun3 (Model m){
		m.addAttribute("name", "Aman");
		return "page2";
	}
	
	@RequestMapping("/test4")
	String fun4 (Model m) {
		Student s = new Student(101, "Aman");
		m.addAttribute("obj", s);
		return "page3";
	}
	
	//form url
	@RequestMapping("/form")
	String fun5 (Model m) {
		
		Student s = new Student();
		m.addAttribute("obj", s);
		return "page4";
	}
	
	@RequestMapping("/demo")
	@ResponseBody
	String fun6 (@ModelAttribute("obj") Student s) {
		
		System.out.println("Roll = "+s.getRoll());
		System.out.println("Name = "+s.getName());
		
		String Msg  = "<h1> Hey "+ s.getName() + ", Your Data is saved. </h1>";
		
		return Msg;
	}
	
	
}
