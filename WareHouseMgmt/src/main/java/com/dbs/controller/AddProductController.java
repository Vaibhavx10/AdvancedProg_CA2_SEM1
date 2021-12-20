package com.dbs.controller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.Product;
import com.dbs.service.EmailNotification;
import com.dbs.service.ProdService;


/**
 * @author Vaibhav
 * Controller for product operations
 */
@RestController
public class AddProductController {
	private final Logger log = LoggerFactory.getLogger(AddProductController.class);

	@Autowired
	ProdService prodService;

	
	/**API Method : addDataToProductTable
	 * @author Vaibhav
	 * add data to product table
	 * parameters : String,String, String,String,String,String,String,String
	 * returns : String
	 */	
	@PostMapping("/addDataToProductTable")
	public String addDataToProductTable(@RequestParam String productname, @RequestParam String quantity,
			@RequestParam String unitprice, @RequestParam String productcatname, @RequestParam String description,
			@RequestParam String ddproductcatname , @RequestParam String productCategoryId , @RequestParam String storageTypeId) {
			log.info("productCategoryId :: "+productCategoryId);
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
		

			log.info("productname :: " + productname);

		return "Cool";
	}
}
