package com.dbs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Supplier")
@SuppressWarnings("unused")
public class Supplier {

	@Id
	@GeneratedValue
	private Integer SupplierId;
	
	private String SupplierName;
	
	private String SupplierContact;
	
	private String SupplierAddress;

}
