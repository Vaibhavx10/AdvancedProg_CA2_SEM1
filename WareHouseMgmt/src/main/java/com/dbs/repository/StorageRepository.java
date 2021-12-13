/**
 * 
 */
package com.dbs.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

/**
 * @author Pankesh
 *
 */

@Repository
public class StorageRepository {
	@PersistenceContext
    private EntityManager manager;
	
	public void getStorageByType(int storageTypeId) {
		try {
			StoredProcedureQuery storedProcedure = manager.createStoredProcedureQuery("WHM_GetAllStorageByType");
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
