/**
 * 
 */
package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.dbs.entity.WarehouseUser;
import com.dbs.service.LoginService;

/**
 * @author Pankesh
 *
 */

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping("/addUser")
	public WarehouseUser addWarehouseUser(@RequestBody WarehouseUser user) {
		System.out.println(">>> addUser");
		System.out.println(user);
		return loginService.addWarehouseUser(user);
	}
}
