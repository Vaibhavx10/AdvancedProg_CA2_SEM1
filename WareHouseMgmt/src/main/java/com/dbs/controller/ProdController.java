package com.dbs.controller;

import java.util.ArrayList;
import java.util.List;

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

import com.dbs.entity.Product;
import com.dbs.entity.Shipment;
import com.dbs.service.ProdService;

@Controller
public class ProdController {

	private final Logger log = LoggerFactory.getLogger(ProdController.class);

	@Autowired
	ProdService prodService;

	@PostMapping("/addProdct")
	public Product addProdct(@RequestBody Product product) {
		return prodService.saveStuff(product);
	}

	@GetMapping("/getProduct/{id}")
	public Product getProdct(@PathVariable int id) {
		return prodService.getStuffByID(id);
	}

	@RequestMapping("/")
	public String dashboardhome(Model model) {
		System.out.println("inside dashboard");
		model.addAttribute("appName", "dashboard");
		return "Dashboard";
	}

	@GetMapping("/home")
	public String testingGroud(Model model) {
		model.addAttribute("appNazzme", "pokimon");
		return "Home";
	}

	@GetMapping("/getAllProducts")
	public String getAllProducts(Model model) {
		List<Product> lproduct = prodService.getAllProductsPerDate();

		System.out.println(" lproduct :: " + lproduct);

		System.out.println("lproduct >> " + lproduct);

		ArrayList<String> xAxis = new ArrayList<String>();
		ArrayList<Long> yAxis = new ArrayList<Long>();

		for (int i = 0; i < lproduct.size(); i++) {
			yAxis.add(lproduct.get(i).getProductPerDay());
			xAxis.add('"' + lproduct.get(i).getProductDate() + '"');
		}

		model.addAttribute("xAxis", xAxis);
		model.addAttribute("yAxis", yAxis);
		
		
		
		//Get Data for Shipment Display
		List<Shipment> shdata = prodService.getShipmentDetails();

		return "Dashboard";
	}
	
	
	@GetMapping("/getShipmentInfo")
	public void getShipmentInfo() {
		prodService.getShipmentDetails();
	}
}
