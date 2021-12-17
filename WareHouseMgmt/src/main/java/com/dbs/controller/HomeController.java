/**
 * 
 */
package com.dbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Pankesh
 * Controller for Login and Home pages
 */

@Controller
public class HomeController {
	
	
	/**Method : Login
	 * @author Pankesh
	 * Get Login page
	 * parameters : Model
	 * returns : String
	 */	
	@GetMapping("/login")
	public String Login(Model model) {
		return "Login";
	}
}
