package com.dbs.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class PurchaseDetail {
	private Integer OrderId;
	private Product Product;
	private Integer Quantity;
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
	 * @return the product
	 */
	public Product getProductd() {
		return Product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		Product = product;
	}
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return Quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
}
