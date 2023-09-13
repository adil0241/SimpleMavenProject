package com.simpleproject.maven.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simpleproject.maven.JSON.AddRequest;
import com.simpleproject.maven.JSON.AddResponse;

@RestController

public class Controller {
	@RequestMapping("/hey")
	public String hello() {
		return"hey buudy";
	}
	@PostMapping("/Add")
	@ResponseBody
	public AddResponse add(@RequestBody AddRequest request) {
		System.out.println("AddRequest: "+request);
		int result=request.getNum1()+request.getNum2();
		
		AddResponse response=new AddResponse();
		response.setRes(result);
		return response;
	}
}
