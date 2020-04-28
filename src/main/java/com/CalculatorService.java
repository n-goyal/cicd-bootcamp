package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/calculate")
	public int sum(int a, int b) {
		return a+b;
	}
	@GetMapping("/calculate")
	public int diff(int a, int b) {
		return a-b;
	}
	@GetMapping("/calculate")
	public int mul(int a, int b) {
		return a*b;
	}
	@GetMapping("/calculate")
	public int div(int a, int b) {
		return a/b;
	}
	
}
