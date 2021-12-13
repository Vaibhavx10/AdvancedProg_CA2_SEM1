/**
 * 
 */
package com.dbs.controller;

import java.util.List;

/**
 * @author Pankesh
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.StorageDetail;
import com.dbs.service.StorageService;

@RestController
public class StorageController {
	@Autowired
	private StorageService storageService;
	
	
	@GetMapping("/getStorageDetail")
	public List<StorageDetail> getStorageByType(int storageTypeID) {
		return storageService.getStorageByType(storageTypeID);
	}
}
