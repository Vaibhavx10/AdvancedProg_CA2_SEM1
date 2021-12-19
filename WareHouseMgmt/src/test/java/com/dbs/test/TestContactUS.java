package com.dbs.test;


import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.dbs.controller.ContactUSController;
import com.dbs.repository.ContactUSRepo;
import com.dbs.service.ContactUSService;

@WebMvcTest(ContactUSController.class)
public class TestContactUS {

	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ContactUSService contactService;
	
	@MockBean
	private ContactUSRepo contactRepo;
	
	
	@Test
	@DisplayName("Check if We can add contact info in DB")
	public void testContactUS() throws Exception {


 
		mockMvc.perform(post("/addContactInfoInDB")
				.param("FirstName","human")
						.param("LastName","Jone")
						.param("Email","human@jone.gmail.com")
						.param("Country","peru")
						.param("Phone","9820821548")
						.param("Message","Message test Case")
				)
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Pass")));
		
		
	}
}
