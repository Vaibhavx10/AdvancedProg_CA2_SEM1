/**
 * 
 */
package com.dbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Order;
import com.dbs.entity.Product;
import com.dbs.entity.PurchaseDetail;
import com.dbs.entity.WarehouseUser;
import com.dbs.repository.*;
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * @author Pankesh
 * Service for Order Related operations
 */
@Service
public class OrderService {

	@Autowired
	private OrderRepository orderReposiotry;

	@Autowired
	private ProdctReposiotry productReposiotry;

	
	/**Method : getOrdersList
	 * @author Pankesh
	 * Get list of orders
	 * returns : List<Order>
	 */	
	public List<Order> getOrdersList() {
		/* defined object variables */
		List<Order> objOrder = null;
		List<Product> objProd = null;
		try {
			/* call repository and assign to variable*/
			objOrder = orderReposiotry.findAll();
			objProd = productReposiotry.findAll();

			
			/* Looping Order list for logic and data manipulation */
			for (Order objectOrder : objOrder) {

				/* Creates JSON object from xml string */
				JSONObject jsonPurchaseDetail = XML.toJSONObject(objectOrder.getPurchaseDetails());

				/* gets OrderDetail json array, or null if its not an array */ 
				JSONArray arrPurchaseDetail = jsonPurchaseDetail.getJSONObject("PurchaseDetail")
												.optJSONArray("OrderDetail");
				
				/* for single orderdetil child elemement, array is null */
				if(arrPurchaseDetail==null) {
					/* create json array */ 
					arrPurchaseDetail=new JSONArray();
					
					/* get json object for OrderDetail */
					JSONObject objOrderDetail = jsonPurchaseDetail.getJSONObject("PurchaseDetail")
							.getJSONObject("OrderDetail");
					
					/* add the object in array */
					arrPurchaseDetail.put(objOrderDetail);
				}
				
				
				/* create a list of purchase detail */
				List<PurchaseDetail> filteredProd = new ArrayList<PurchaseDetail>();
				
				/* looping to compare and filter products to add in purchase list */
				for (int i = 0; i < arrPurchaseDetail.length(); i++) {
					
					/* Gets product Id value*/
					String prod = arrPurchaseDetail.getJSONObject(i).get("ProductId").toString();
					
					/* Creating PurchaseDetail object and assigning values */
					
					PurchaseDetail objPD = new PurchaseDetail();
					objPD.setOrderId(objectOrder.getOrderId());
					Object[] p = objProd.stream().filter(x -> x.getProductId().toString().equals(prod)).toArray();

					objPD.setProduct((Product) p[0]);

					Integer Quantity = ((Long) arrPurchaseDetail.getJSONObject(i).get("Quantity")).intValue();
					objPD.setQuantity(Quantity);

					/* adding in purchase detail list */
					filteredProd.add(objPD);
				}
				objectOrder.setProductList(filteredProd);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		/* returns result */
		return objOrder;
	}

	
	/**Method : getProducts
	 * @author Pankesh
	 * Get list of orders 
	 * returns : List<Order>
	 */	
	public List<Product> getProducts() {
		/* defined object variable */
		List<Product> objProd = null;
		try {
			/* call repository and assign to variable*/
			objProd = productReposiotry.findAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
		/* returns result */
		return objProd;
	}

	
	/**Method : addOrder
	 * @author Pankesh
	 * Get list of orders
	 * Params : Order
	 */	
	public void addOrder(Order objOrder) {
		try {
			/* call repository*/
			orderReposiotry.addOrder(objOrder.getCustomerId(), objOrder.getPurchaseDetails());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
