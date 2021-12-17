/**
 * 
 */
package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbs.entity.WarehouseUser;
import com.dbs.repository.LoginRepository;

/**
 * @author Pankesh
 *
 */
@Service
public class LoginService {

	@Autowired
	private LoginRepository loginReposiotry;
	
	public WarehouseUser addWarehouseUser(WarehouseUser user) {
		WarehouseUser objWarehouseUser=null;
		try {
			objWarehouseUser= loginReposiotry.save(user);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objWarehouseUser;	
	}
	
	public WarehouseUser loginWarehouseUser(String userName,String password) {
		WarehouseUser objWarehouseUser=null;
		try {
			objWarehouseUser= loginReposiotry.findByLoginDetails(userName, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objWarehouseUser;	
	}
}
