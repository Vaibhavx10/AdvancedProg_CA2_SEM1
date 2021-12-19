package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.ContactUS;
import com.dbs.repository.ContactUSRepo;

@Service
public class ContactUSService {

	@Autowired
	private ContactUSRepo contactUSRepo;

	public void addContactInfo(ContactUS cont) {
		contactUSRepo.save(cont);
	}

}
