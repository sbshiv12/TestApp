package com.iotlogix.dummy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {

	
	@RequestMapping("/rest")
	public String viewHomePage(Model model) {
		return "rest";
	}
}
