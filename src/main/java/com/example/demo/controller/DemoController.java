package com.example.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.SaveRequest;
import com.example.demo.service.Demoservice;

@RestController
public class DemoController {

	@Autowired
	Demoservice demoService;

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/login")
	public String testDB(@RequestBody LoginRequest loginRequest) {
		if (loginRequest.getUserName().equals("akhila") && loginRequest.getPassword().equals("akhila123")) {
			return "SUCCESS";
		} else if (loginRequest.getUserName().equals("gayathri") && loginRequest.getPassword().equals("gayathri123")) {
			return "SUCCESS";
		} else {
			return "INVALID CREDENTIALS";
		}
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/save")
	public String testDB(@RequestBody SaveRequest loginRequest) {
		demoService.saveDetails(loginRequest);
		return "SUCCESS";
		
	}

}
