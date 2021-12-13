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
 *
 */

@Repository
public class StorageRepository {
	@PersistenceContext
    private EntityManager manager;
	
	public List<StorageDetail> getStorageByType(int storageTypeId) {
		List<StorageDetail> obj=null;
		try {
			StoredProcedureQuery storedProcedure = manager.createStoredProcedureQuery("WHM_GetAllStorageByType")
					.registerStoredProcedureParameter("p_StorageTypeId" , Integer.class , ParameterMode.IN);
											
			storedProcedure.setParameter("p_StorageTypeId", storageTypeId);
			
			storedProcedure.execute();
			obj=storedProcedure.getResultList();
			
			System.out.println(obj);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
