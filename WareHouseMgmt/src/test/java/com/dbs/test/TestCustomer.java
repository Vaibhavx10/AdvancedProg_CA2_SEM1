package com.dbs.test;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.dbs.controller.CustomerController;
import com.dbs.entity.Customer;
import com.dbs.service.CustomerService;

@WebMvcTest(CustomerController.class)
public class TestCustomer {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private CustomerService customerService;
	
	@Test
	@DisplayName("Check if Customer is Present")
	public void testCustomer() throws Exception {
		Customer cust = new Customer(Integer.valueOf(2), "Lidl", "<Address><AddressLine> Hugh Lane\\t</AddressLine><City>Dublin</City><State>Lienster</State><Country>Ireland</Country><PostalCode>D024Y74</PostalCode></Address>", Integer.valueOf(45655484));
		
		when(customerService.getONCustID(Integer.valueOf(2))).thenReturn(cust);
		
		mockMvc.perform(get("/getCustomerDataOnID")
				.param("custID", "2")
				)
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.customerName", Matchers.is("Lidl")));
		
		
		
	}

}
