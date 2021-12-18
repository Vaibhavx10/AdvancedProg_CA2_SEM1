package com.dbs.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.Product;
import com.dbs.service.ProdService;

@RestController
public class AddProductController {

	@Autowired
	ProdService prodService;

	@PostMapping("/addDataToProductTable")
	public String addDataToProductTable(@RequestParam String productname, @RequestParam String quantity,
			@RequestParam String unitprice, @RequestParam String productcatname, @RequestParam String description,
			@RequestParam String ddproductcatname , @RequestParam String productCategoryId , @RequestParam String storageTypeId) {
			System.out.println("productCategoryId :: "+productCategoryId);
			LocalDate prdDate = LocalDate.now(); // Create a date object
			Product prd = new Product();
			try {
				
				prd.setProductName(productname);
				prd.setProductCategoryId(Integer.parseInt(productCategoryId));
				prd.setStorageTypeId(Integer.parseInt(storageTypeId));
				prd.setSupplierId(1);
				prd.setQuantityPerUnit(Integer.parseInt(quantity));
				prd.setUnitPrice(50);
				prd.setProductDate(prdDate.toString());
				
				prodService.saveStuff(prd);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		

		System.out.println("productname :: " + productname);

		return "Cool";
	}
}
