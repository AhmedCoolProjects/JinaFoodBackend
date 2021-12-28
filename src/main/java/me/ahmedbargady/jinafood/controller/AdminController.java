package me.ahmedbargady.jinafood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ahmedbargady.jinafood.model.AdminDashboardCard;
import me.ahmedbargady.jinafood.model.DummyData;

@Controller
@RequestMapping("/api/v1/admin")
public class AdminController {

	DummyData dummyData = new DummyData();
	AdminDashboardCard[] listCards = dummyData.getListCards();

	@GetMapping
	public String admin(Model model) {
		model.addAttribute("cardsData", listCards);
		model.addAttribute("title", "Dashboard");
		return "admin/index";
	}

}
