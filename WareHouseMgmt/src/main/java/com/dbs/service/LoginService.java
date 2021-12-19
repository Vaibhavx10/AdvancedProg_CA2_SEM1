/**
 * 
 */
package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Product;
import com.dbs.entity.WarehouseUser;
import com.dbs.repository.LoginRepository;

/**
 * @author Pankesh
 * Service for login operations
 */
@Service
public class LoginService {

	@Autowired
	private LoginRepository loginReposiotry;
	
	
	/**Method : addWarehouseUser
	 * @author Pankesh
	 * add user details
	 * parameters : WarehouseUser
	 * returns : WarehouseUser
	 */	
	public WarehouseUser addWarehouseUser(WarehouseUser user) {

		/* defined object variable */
		WarehouseUser objUser = null;
		try {
			/* call repository and assign to variable*/
			objUser = loginReposiotry.save(user);

		} catch (Exception e) {
			e.printStackTrace();
		}
		/* returns result */
		return objUser;
	}
	
	/**Method : addWarehouseUser
	 * @author Pankesh
	 * login with user details
	 * parameters : String, String
	 * returns : WarehouseUser
	 */
	public WarehouseUser loginWarehouseUser(String userName,String password) {

		/* defined object variable */
		WarehouseUser objUser = null;
		try {
			/* call repository and assign to variable*/
			objUser = loginReposiotry.findByLoginDetails(userName, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		/* returns result */
		return objUser;
	}
}
