/**
 * 
 */
package com.dbs.controller;



/**
 * @author Pankesh
 * Controller for Storage related pages
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StorageController {
	
	/**Method : getStorages
	 * @author Pankesh
	 * Get storage page
	 * parameters : Model
	 * returns : String
	 */	
	@GetMapping("/storage")
	public String getStorages(Model model) {
		return "Storage";
	}
	
	/**Method : getStorageInventory
	 * @author Pankesh
	 * Get storageInventory page
	 * parameters : Model
	 * returns : String
	 */	
	@GetMapping("/storageInventory")
	public String getStorageInventory(Model model) {
		return "StorageInventory";
	}
}
