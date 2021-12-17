/**
 * 
 */
package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbs.entity.Order;
import com.dbs.repository.*;


/**
 * @author Pankesh
 *
 */
public class OrderService {

	@Autowired
	private OrderRepository orderReposiotry;
	
	public List<Order> getOrdersList() {
		List<Order> objOrder=null;
		try {
			objOrder = orderReposiotry.findAll();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objOrder;
	}
}
