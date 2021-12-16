/**
 * 
 */
package com.dbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @author Pankesh
 *
 */

@Controller
public class LoginController {

	@GetMapping("/login")
	public String Login(Model model) {
		return "Login";
	}
}
