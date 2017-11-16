package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {
	@RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World";
    }
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldController.class, args);
    }
}