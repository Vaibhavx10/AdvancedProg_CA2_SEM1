/**
 * 
 */
package com.dbs.controller;

import java.util.List;

/**
 * @author Pankesh
 * Service for Storage related operations
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dbs.entity.StorageDetail;
import com.dbs.service.StorageService;

@Controller
public class StorageController {
	
	@GetMapping("/storage")
	public String getStorages(Model model) {
		return "Storage";
	}
	
}
