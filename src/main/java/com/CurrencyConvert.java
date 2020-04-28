package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConvert {

	@GetMapping("/convert")
	public int rupees2Dollar(int rupees, int DollarRate) {
		return rupees/DollarRate;
	}
	public int rupees2Euros(int rupees, int EuroRate) {
		return rupees/EuroRate;
	}
	public int rupees2Dinar(int rupees, int DinarRate) {
		return rupees/DinarRate;
	}
}
