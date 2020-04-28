package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCurrencyConvert {

	@Test
	public void dollarCheck() {
		int rupee = 150; 
		int rate = 75;
		CurrencyConvert cc = new CurrencyConvert();
		Assertions.assertEquals(2, cc.rupees2Dollar(rupee,rate));
	}
	@Test
	public void euroCheck() {
		int rupee=84;
		int rate=168;
		CurrencyConvert cc = new CurrencyConvert();
		Assertions.assertEquals(2, cc.rupees2Euros(rupee, rate));
	}
	@Test
	public void dinarCheck() {
		int rupee=510;
		int rate=255;
		CurrencyConvert cc = new CurrencyConvert();
		Assertions.assertEquals(2, cc.rupees2Dinar(rupee, rate));
	}
}
