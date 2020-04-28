package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	
	@Test
	public void sumTest() {
		int a = 9;
		int b = 11;
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(20, cs.sum(a, b));
	}
	@Test
	public void diffTest() {
		int a = 11;
		int b = 9;
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(2, cs.diff(a, b));
	}
	@Test
	public void mulTest() {
		int a = 9;
		int b = 11;
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(99, cs.mul(a, b));
	}
	@Test
	public void divTest() {
		int a = 20;
		int b = 10;
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(2, cs.div(a, b));
	}
}
