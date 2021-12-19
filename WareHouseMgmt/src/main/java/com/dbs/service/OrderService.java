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
 *
 */
@Service
public class OrderService {

	@Autowired
	private OrderRepository orderReposiotry;

	@Autowired
	private ProdctReposiotry productReposiotry;

	public List<Order> getOrdersList() {
		List<Order> objOrder = null;
		List<Product> objProd = null;
		try {
			objOrder = orderReposiotry.findAll();
			objProd = productReposiotry.findAll();

			for (Order objectOrder : objOrder) {

				JSONObject jsonPurchaseDetail = XML.toJSONObject(objectOrder.getPurchaseDetails());
				
				
				
				

				
				JSONArray arrPurchaseDetail = jsonPurchaseDetail.getJSONObject("PurchaseDetail")
												.optJSONArray("OrderDetail");
				JSONArray arrOrderDetail = new JSONArray();
				if(arrPurchaseDetail==null) {
					JSONObject objOrderDetail = jsonPurchaseDetail.getJSONObject("PurchaseDetail")
							.getJSONObject("OrderDetail");
					arrOrderDetail.put(objOrderDetail);
				}
				
				
				
				List<PurchaseDetail> filteredProd = new ArrayList<PurchaseDetail>();
				System.out.println(objectOrder);
				
				for (int i = 0; i < arrOrderDetail.length(); i++) {
					String prod = arrOrderDetail.getJSONObject(i).get("ProductId").toString();

					PurchaseDetail objPD = new PurchaseDetail();
					objPD.setOrderId(objectOrder.getOrderId());
					Object[] p = objProd.stream().filter(x -> x.getProductId().toString().equals(prod)).toArray();

					objPD.setProduct((Product) p[0]);

					Integer Quantity = ((Long) arrOrderDetail.getJSONObject(i).get("Quantity")).intValue();
					objPD.setQuantity(Quantity);

					filteredProd.add(objPD);
				}
				objectOrder.setProductList(filteredProd);
			}

			System.out.println(objOrder);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return objOrder;
	}

	public List<Product> getProducts() {
		List<Product> objProd = null;
		try {
			objProd = productReposiotry.findAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return objProd;
	}

	public void addOrder(Order objOrder) {
		try {
			orderReposiotry.addOrder(objOrder.getCustomerId(), objOrder.getPurchaseDetails());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
