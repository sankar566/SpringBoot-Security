package com.security.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController              
public class HelloController {
	
	@GetMapping("/")
	 public String sayhello() {
		 return "hello function";
	 }
	@GetMapping("/user")
	 public String sayuser() {
		 return "hello user";
	 }
	@GetMapping("/admin")
	 public String sayadmin() {
		 return "hello admin";
	 }

}
