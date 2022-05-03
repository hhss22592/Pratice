package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TestService;

@RestController//(@Controller+@ResponseBody)
public class TestController {
	
	@Autowired
	TestService tService;
	
	@GetMapping("/aaa")
	public String hello() {
		return "HelloWorld";
	}
	
	@GetMapping("/bbb")
	public List<String> bbb(){
		System.out.println("뭐지");
		return tService.list();
	}
}
