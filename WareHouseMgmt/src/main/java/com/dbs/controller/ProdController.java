package com.dbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.entity.Product;
import com.dbs.service.ProdService;

@Controller
public class ProdController {
	
	private final Logger log = LoggerFactory.getLogger(ProdController.class);
	
	/*
	 * @Autowired ProdService prodService;
	 * 
	 * 
	 * @PostMapping("/addProdct") public Product addProdct(@RequestBody Product
	 * product) { return prodService.saveStuff(product); }
	 * 
	 * @GetMapping("/getProduct/{id}") public Product getProdct(@PathVariable int
	 * id) { return prodService.getStuffByID(id); }
	 */
	
	
	
	@RequestMapping("/dash")
	public String dashboard(Model model) {
		System.out.println("inside dashboard");
		model.addAttribute("appName", "dashboard");
		return "Dashboard";
	}

	@GetMapping("/home")
	public String testingGroud(Model model) {
		model.addAttribute("appNazzme", "pokimon");
		return "Home";
	}
}
