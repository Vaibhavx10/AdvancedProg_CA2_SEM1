package com.dbs.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.ContactUS;

@RestController
public class ContactUSController {
	
	

	@PostMapping(value = "/addContactInfoInDB")
	private String addContactInfoInDB(@RequestBody ContactUS contactus) {
		
		
		return null;
	}
	
}
