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
		return loginReposiotry.save(user);
	}
	
	public WarehouseUser loginWarehouseUser(String userName,String password) {
		return loginReposiotry.findByLoginDetails(userName, password);
	}
}
