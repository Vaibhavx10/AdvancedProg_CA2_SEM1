package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.Customer;
import com.dbs.service.CustomerService;


/**
 * @author Vaibhav
 * Controller for customer
 */
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	/**API Method : getCustomerDataOnID
	 * @author Vaibhav
	 * add contact info
	 * parameters : int
	 * returns : Customer
	 */	
	@GetMapping("/getCustomerDataOnID")
	public Customer getCustomerDataOnID(String custID) {
		return customerService.getONCustID(Integer.parseInt(custID));
	}
	
	

}
