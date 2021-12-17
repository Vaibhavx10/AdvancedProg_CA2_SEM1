/**
 * 
 */
package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.StorageDetail;
import com.dbs.entity.WarehouseUser;
import com.dbs.service.LoginService;

/**
 * @author Pankesh
 * RestConrtoller for Login operations
 */


@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	
	/**API Method : addWarehouseUser
	 * @author Pankesh
	 * Add warehouse user
	 * parameters : WarehouseUser
	 * returns : WarehouseUser
	 */	
	@PostMapping("/addUser")
	public WarehouseUser addWarehouseUser(@RequestBody WarehouseUser user) {
		WarehouseUser objWarehouseUser=null;
		try {
			objWarehouseUser= loginService.addWarehouseUser(user);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objWarehouseUser;		
	}
	
	
	/**API Method : loginWarehouseUser
	 * @author Pankesh
	 * login WarehouseUser
	 * parameters : String,String
	 * returns : WarehouseUser
	 */	
	@GetMapping("/loginUser")
	public WarehouseUser loginWarehouseUser(String userName,String password) {	
		WarehouseUser objWarehouseUser=null;
		try {
			objWarehouseUser= loginService.loginWarehouseUser(userName,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objWarehouseUser;	
	}
}
