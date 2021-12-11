package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Customer;
import com.dbs.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	/* Get data based on CustID */
	public Customer getONCustID(int custID) {
		return customerRepo.findById(custID).orElse(null);
	}

}
