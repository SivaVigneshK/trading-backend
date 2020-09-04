package com.trading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradingController {
	
	@GetMapping("/login")
	public void getLoginDetails()
	{
		//return "success";
	}

}
