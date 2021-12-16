package com.dbs.controller;


/**
 * 
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.StorageDetail;
import com.dbs.entity.StorageInventory;
import com.dbs.service.StorageService;

/**
 * @author Pankesh
 * Service for Storage related operations
 */

@RestController
public class StorageDetailController {
	@Autowired
	private StorageService storageService;
	
	@GetMapping("/getStorageDetail")
	public List<StorageDetail> getStorageByType(int storageTypeID) {
		return storageService.getStorageByType(storageTypeID);
	}
	
	@GetMapping("/getStorageInventory")
	public List<StorageInventory> getStorageInventory(int storageId) {
		return storageService.getStorageInventory(storageId);
	}	
	
	@GetMapping("/getStorageInfo")
	public List<StorageDetail> getStorageInfo(int storageId) {
		return storageService.getStorageInfo(storageId);
	}
}