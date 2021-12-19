package com.dbs.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.ContactUS;
import com.dbs.repository.ContactUSRepo;



/**
 * @author Chirag
 * Controller for contact us
 */
@RestController
public class ContactUSController {

	@Autowired
	private ContactUSRepo contactUSRepo;

	/**API Method : addDataToProductTable
	 * @author Chirag
	 * add contact info
	 * parameters : String,String, String,String,String,String
	 * returns : String
	 */	
	@PostMapping(value = "/addContactInfoInDB")
	private String addContactInfoInDB(@RequestParam String FirstName, @RequestParam String LastName,
			@RequestParam String Email, @RequestParam String Country, @RequestParam String Phone,
			@RequestParam String Message) {
		try {
			LocalDate contactDate = LocalDate.now(); // Create a date object
			ContactUS contact = new ContactUS(FirstName, LastName, Email, Country, Phone, Message,contactDate.toString());
			contactUSRepo.save(contact);

			System.out.println("contactus :: " + Message);
			return "Pass";

		} catch (Exception e) {
			e.printStackTrace();

		}
		return "Failed in addContactInfoInDB";

	}

}
