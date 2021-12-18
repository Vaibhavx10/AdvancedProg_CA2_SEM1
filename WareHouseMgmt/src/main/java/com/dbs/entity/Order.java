package com.dbs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[Order]")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer OrderId;
	private String OrderDate;
	private String PurchaseDetails;
	
	@Transient
	private Integer CustomerId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CustomerId")
	private Customer customerDetail;
	
	@Transient
	private List<PurchaseDetail> ProductList;
	
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
	/**
	 * @return the productList
	 */
	public List<PurchaseDetail> getProductList() {
		return ProductList;
	}
	/**
	 * @param filteredProd the productList to set
	 */
	public void setProductList(List<PurchaseDetail> productList) {
		ProductList = productList;
	}
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

	

}
