package com.dbs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue
	private Integer ProductId;
	@Column(name = "ProductName")
	private String productName;
	private Integer ProductCategoryId;
	private Integer StorageTypeId;
	private Integer SupplierId;
	private Integer QuantityPerUnit;
	private Integer UnitPrice;
	private String ProductDate;
	
	
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
	
	

}
