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
 * RestConrtoller for Storage related operations
 */

@RestController
public class StorageDetailController {
	@Autowired
	private StorageService storageService;
	
	/**API Method : getStorageByType
	 * @author Pankesh
	 * Get all storages by type
	 * parameters : int
	 * returns : List<StorageDetail>
	 */	
	@GetMapping("/getStorageDetail")
	public List<StorageDetail> getStorageByType(int storageTypeID) {
		return storageService.getStorageByType(storageTypeID);
	}
	
	/**API Method : getStorageInventory
	 * @author Pankesh
	 * Get storage inventory info
	 * parameters : int
	 * returns : List<StorageInventory>
	 */	
	@GetMapping("/getStorageInventory")
	public List<StorageInventory> getStorageInventory(int storageId) {
		return storageService.getStorageInventory(storageId);
	}	
	
	/**API Method : getStorageInfo
	 * @author Pankesh
	 * Get storage detail by id
	 * parameters : int
	 * returns : List<StorageDetail>
	 */	
	@GetMapping("/getStorageInfo")
	public List<StorageDetail> getStorageInfo(int storageId) {
		return storageService.getStorageInfo(storageId);
	}
}