package com.dbs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ProductId;
	@Column(name = "ProductName")
	private String productName;
	private Integer ProductCategoryId;
	private Integer StorageTypeId;
	private Integer SupplierId;
	private Integer QuantityPerUnit;
	private Integer UnitPrice;
	private String ProductDate;

	@Transient
	private Long ProductPerDay;
	
	
	

	public Product() {
	}

	public Product(Integer productId, String productName, Integer storageTypeId) {
		this.ProductId = productId;
		this.productName = productName;
		this.StorageTypeId = storageTypeId;
	}

	public Product( String productDate, Long productPerDay) {
		this.ProductDate = productDate;
		this.ProductPerDay = productPerDay;
	}
	

	
	public Integer getProductId() {
		return ProductId;
	}

	public void setProductId(Integer productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductCategoryId() {
		return ProductCategoryId;
	}

	public void setProductCategoryId(Integer productCategoryId) {
		ProductCategoryId = productCategoryId;
	}

	public Integer getStorageTypeId() {
		return StorageTypeId;
	}

	public void setStorageTypeId(Integer storageTypeId) {
		StorageTypeId = storageTypeId;
	}

	public Integer getSupplierId() {
		return SupplierId;
	}

	public void setSupplierId(Integer supplierId) {
		SupplierId = supplierId;
	}

	public Integer getQuantityPerUnit() {
		return QuantityPerUnit;
	}

	public void setQuantityPerUnit(Integer quantityPerUnit) {
		QuantityPerUnit = quantityPerUnit;
	}

	public Integer getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		UnitPrice = unitPrice;
	}

	public String getProductDate() {
		return ProductDate;
	}

	public void setProductDate(String productDate) {
		ProductDate = productDate;
	}

	public Long getProductPerDay() {
		return ProductPerDay;
	}

	public void setProductPerDay(Long productPerDay) {
		ProductPerDay = productPerDay;
	}
	
	

}
