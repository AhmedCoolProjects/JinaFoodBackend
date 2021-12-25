package me.ahmedbargady.jinafood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	@GetMapping
	public String home() {
		return "Thanks GOD, Hamdulilaaah";
	}

	@RequestMapping("/api/v1/")
	public String api() {
		return "This API is for https://jinafood.vercel.app application!";
	}
	
	@RequestMapping("/api/v1/admin")
	public String admin() {
		return "Admin Dashboard";
	}

}
