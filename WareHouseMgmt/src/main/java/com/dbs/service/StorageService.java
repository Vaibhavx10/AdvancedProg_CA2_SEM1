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
import com.dbs.repository.StorageRepository;

@Service
public class StorageService {

	@Autowired
	private StorageRepository storageRepo;

	/* Get data based on CustID */
	public List<StorageDetail> getStorageByType(int storageTypeID) {
		return storageRepo.getStorageByType(storageTypeID);
	}

}
