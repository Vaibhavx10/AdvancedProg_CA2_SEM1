/**
 * 
 */
package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbs.entity.WarehouseUser;

/**
 * @author Pankesh
 * Login Interface, to handle Login and register related opeartions
 * extends : JpaRepository<WarehouseUser, Integer>
 */
public interface LoginRepository extends JpaRepository<WarehouseUser, Integer> {

	
	/**Method : findByLoginDetails
	 * @author Pankesh
	 * Get user details by username and password
	 * parameters : String, String
	 * returns : WarehouseUser
	 */
	@Query(value="SELECT WarehouseUserId, UserName, Password, UserRole FROM WarehouseUser WHERE UserName = ?1 AND Password = ?2",nativeQuery = true)
	public WarehouseUser findByLoginDetails(String UserName, String Password);
}
