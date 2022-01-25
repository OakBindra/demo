package com.example.demo.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

	@RequestMapping("/demo")
	public String showPage() {
		return "this is demo";
	}
	
	@PostMapping("/fetchData/{name}")
	public String showData(@PathVariable String name) {
		return "helo this is me" +name;
	}
}
