package com.codingdojo.stringproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

 
 public String hello() {
	 return "Hello World";
 }

	 @RequestMapping("random")
	 public String random() {
	 return "Spring Boot is great! So easy to just respond with strings";
	 }
			 }
 

