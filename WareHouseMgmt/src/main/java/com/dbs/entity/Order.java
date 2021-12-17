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
@Table(name = "`Order`")
public class Order {
	@Id
	@GeneratedValue
	private Integer OrderId;
	private String OrderDate;
	private String CustomerId;
	private String PurchaseDetails;
	
	
	
	
	
}
