/**
 * 
 */
package com.dbs.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;


import org.springframework.stereotype.Repository;

import com.dbs.entity.StorageDetail;
import com.dbs.entity.StorageInventory;



/**
 * @author Pankesh
 * Repository for Storage related operations
 */

@Repository
public class StorageRepository {
	@PersistenceContext
    private EntityManager manager;
	
	
	
	/**Method : getStorageByType
	 * @author Pankesh
	 * Get all storages by type
	 * parameters : int
	 * returns : List<StorageDetail>
	 */	
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
	
	
	/**Method : getStorageInventory
	 * @author Pankesh
	 * Get storage inventory info
	 * parameters : int
	 * returns : List<StorageInventory>
	 */	
	@SuppressWarnings("unchecked")
	public List<StorageInventory> getStorageInventory(int storageId) {
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
	
	
	/**Method : getStorageInfo
	 * @author Pankesh
	 * Get storage detail by id
	 * parameters : int
	 * returns : List<StorageDetail>
	 */	
	@SuppressWarnings("unchecked")
	public List<StorageDetail> getStorageInfo(int storageId) {
		List<StorageDetail> obj=null;
		try {
			StoredProcedureQuery storedProcedure = manager.createStoredProcedureQuery("WHM_GetStorageInfo")
					.registerStoredProcedureParameter("p_StorageId" , Integer.class , ParameterMode.IN);
											
			storedProcedure.setParameter("p_StorageId", storageId);
			
			storedProcedure.execute();
			obj=(List<StorageDetail>)storedProcedure.getResultList();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
