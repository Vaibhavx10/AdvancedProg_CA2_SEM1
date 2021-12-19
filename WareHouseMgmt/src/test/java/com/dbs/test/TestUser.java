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

import com.dbs.controller.LoginController;
import com.dbs.entity.WarehouseUser;
import com.dbs.service.LoginService;

@WebMvcTest(LoginController.class)
public class TestUser {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private LoginService loginService;

	@Test
	@DisplayName("Check if User is Present")
	public void testIfUserExists() throws Exception {

		WarehouseUser wr = new WarehouseUser(Integer.valueOf(1), "admin", "admin", Integer.valueOf(1));

		// Here we set what are we expecting when we call the API
		when(loginService.loginWarehouseUser("admin", "admin")).thenReturn(wr);

		//we are also passing parameters 
		mockMvc.perform(get("/loginUser")
				.param("userName", "admin")
				.param("password", "admin")
				)
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.userName", Matchers.is("admin")));

	}
	

}
