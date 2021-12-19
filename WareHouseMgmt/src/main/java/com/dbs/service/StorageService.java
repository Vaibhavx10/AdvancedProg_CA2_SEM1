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
		
		/* defined object variable */
		List<StorageDetail> objStorage=null;
		try {
			/* call repository and assign to variable*/
			objStorage= storageRepo.getStorageByType(storageTypeID);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/* returns variable */
		return objStorage;
	}
	

	/**Method : getStorageInventory
	 * @author Pankesh
	 * Get storage inventory info
	 * parameters : int
	 * returns : List<StorageInventory>
	 */	
	public List<StorageInventory> getStorageInventory(int storageId){
		/* defined object variable */
		List<StorageInventory> objInventory=null;
		try {
			/* call repository and assign to variable*/
			objInventory= storageRepo.getStorageInventory(storageId);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/* returns variable */
		return objInventory;	
	}
	
	
	/**Method : getStorageInfo
	 * @author Pankesh
	 * Get storage detail by id
	 * parameters : int
	 * returns : List<StorageDetail>
	 */	
	public List<StorageDetail> getStorageInfo(int storageId){
		/* defined object variable */
		List<StorageDetail> objStorageDetail=null;
		try {
			/* call repository and assign to variable*/
			objStorageDetail= storageRepo.getStorageInfo(storageId);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/* returns variable */
		return objStorageDetail;
	}
}
