/**
 * 
 */
package com.dbs.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import com.dbs.entity.*;
import org.springframework.stereotype.Repository;



/**
 * @author Pankesh
 * Repository for Storage related operations
 */

@Repository
public class StorageRepository {
	@PersistenceContext
    private EntityManager manager;
	
	@SuppressWarnings("unchecked")
	public List<StorageDetail> getStorageByType(int storageTypeId) {
		List<StorageDetail> obj=null;
		try {
			StoredProcedureQuery storedProcedure = manager.createStoredProcedureQuery("WHM_GetAllStorageByType")
					.registerStoredProcedureParameter("p_StorageTypeId" , Integer.class , ParameterMode.IN);
											
			storedProcedure.setParameter("p_StorageTypeId", storageTypeId);
			
			storedProcedure.execute();
			obj=(List<StorageDetail>)storedProcedure.getResultList();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<StorageInventory> GetStorageInventory(int storageId) {
		List<StorageInventory> obj=null;
		try {
			StoredProcedureQuery storedProcedure = manager.createStoredProcedureQuery("WHM_GetStorageInventory")
					.registerStoredProcedureParameter("p_StorageId" , Integer.class , ParameterMode.IN);
											
			storedProcedure.setParameter("p_StorageId", storageId);
			
			storedProcedure.execute();
			obj=(List<StorageInventory>)storedProcedure.getResultList();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}
