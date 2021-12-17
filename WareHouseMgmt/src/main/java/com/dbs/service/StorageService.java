/**
 * 
 */
package com.dbs.service;

import java.util.List;

/**
 * @author Pankesh
 * Service for Storage related operations
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Customer;
import com.dbs.entity.StorageDetail;
import com.dbs.entity.StorageInventory;
import com.dbs.repository.StorageRepository;


/**
 * @author Pankesh
 * Service for storage related operation
 */
@Service
public class StorageService {

	@Autowired
	private StorageRepository storageRepo;

	
	
	/**Method : getStorageByType
	 * @author Pankesh
	 * Get all storages by type
	 * parameters : int
	 * returns : List<StorageDetail>
	 */	
	public List<StorageDetail> getStorageByType(int storageTypeID) {
		return storageRepo.getStorageByType(storageTypeID);
	}
	

	/**Method : getStorageInventory
	 * @author Pankesh
	 * Get storage inventory info
	 * parameters : int
	 * returns : List<StorageInventory>
	 */	
	public List<StorageInventory> getStorageInventory(int storageId){
		return storageRepo.getStorageInventory(storageId);
	}
	
	
	/**Method : getStorageInfo
	 * @author Pankesh
	 * Get storage detail by id
	 * parameters : int
	 * returns : List<StorageDetail>
	 */	
	public List<StorageDetail> getStorageInfo(int storageId){
		return storageRepo.getStorageInfo(storageId);
	}
}
