package me.ahmedbargady.jinafood.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	private static final String PATH = "/error";

	public String getErrorPath() {
		return PATH;
	}

	@RequestMapping(PATH)
	public String error() {
		return "No Page: 404";
	}

}
