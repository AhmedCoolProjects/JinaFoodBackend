package me.ahmedbargady.jinafood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ahmedbargady.jinafood.model.AdminDashboardCard;
import me.ahmedbargady.jinafood.model.DummyData;

@Controller
@RequestMapping("/")
public class MainController {
	DummyData dummyData = new DummyData();

	@GetMapping
	public String home() {
		return "index";
	}

	@GetMapping("/api/v1/admin")
	public String admin(Model model) {
		model.addAttribute("cardsData", dummyData.getListCards());
		model.addAttribute("length", 14);
		return "admin";
	}

}
