package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.ContactUS;
import com.dbs.repository.ContactUSRepo;

/**
 * @author Vaibhav
 * Service for contact operation
 */
@Service
public class ContactUSService {

	@Autowired
	private ContactUSRepo contactUSRepo;

	/**Method : addContactInfo
	 * @author Vaibhav
	 * addContactInfo
	 * parameters : ContactUS
	 */
	public void addContactInfo(ContactUS cont) {
		contactUSRepo.save(cont);
	}

}
