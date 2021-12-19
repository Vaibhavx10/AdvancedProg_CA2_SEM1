package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Customer;
import com.dbs.repository.CustomerRepo;


/**
 * @author Vaibhav
 * Service for customer operation
 */
@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	/**Method : getONCustID
	 * @author Vaibhav
	 * get customer
	 * parameters : int
	 * returns : Customer
	 */
	public Customer getONCustID(int custID) {
		return customerRepo.findById(custID).orElse(null);
	}

}
