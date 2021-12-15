/**
 * 
 */
package com.dbs.controller;



/**
 * @author Pankesh
 * Service for Storage related operations
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StorageController {
	
	@GetMapping("/storage")
	public String getStorages(Model model) {
		return "Storage";
	}
	
	
	@GetMapping("/storageInventory")
	public String getStorageInventory(Model model) {
		return "StorageInventory";
	}
}
