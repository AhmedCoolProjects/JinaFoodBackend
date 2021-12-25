package me.ahmedbargady.jinafood.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Thanks GOD, Hamdulilaaah";
	}

}
