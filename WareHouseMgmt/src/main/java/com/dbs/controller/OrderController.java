/**
 * 
 */
package com.dbs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.Order;
import com.dbs.entity.WarehouseUser;
import com.dbs.service.OrderService;

/**
 * @author Pankesh
 *
 */
@RestController
public class OrderController {
	private OrderService orderService;

	/**API Method : loginWarehouseUser
	 * @author Pankesh
	 * login WarehouseUser
	 * parameters : String,String
	 * returns : WarehouseUser
	 */	
	@GetMapping("/getAllOrders")
	public List<Order> getOrdersList() {
		List<Order> objOrder=null;
		try {
			objOrder= orderService.getOrdersList();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objOrder;
	}
}
