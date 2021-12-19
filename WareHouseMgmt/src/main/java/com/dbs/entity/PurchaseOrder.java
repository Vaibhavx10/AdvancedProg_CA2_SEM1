/**
 * 
 */
package com.dbs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pankesh
 *	Entity for Purchase Order
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[Order]")
public class PurchaseOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer OrderId;
	private String OrderDate;
	private Integer CustomerId;
	private String PurchaseDetails;
	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return OrderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}
	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return OrderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return CustomerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}
	/**
	 * @return the purchaseDetails
	 */
	public String getPurchaseDetails() {
		return PurchaseDetails;
	}
	/**
	 * @param purchaseDetails the purchaseDetails to set
	 */
	public void setPurchaseDetails(String purchaseDetails) {
		PurchaseDetails = purchaseDetails;
	}
	
}
