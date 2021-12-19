package com.dbs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * @author Pankesh
 *	Entity for Customer
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "Customer")
@SuppressWarnings("unused")
public class Customer {

	@Id
	@GeneratedValue
	/* @Column(name = "CustomerId") */
	private Integer CustomerId;
	
	private String CustomerName;
	
	private String CustomerAddress;
	
	private Integer CustomerContact;

	public Customer(Integer customerId, String customerName, String customerAddress, Integer customerContact) {
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		CustomerContact = customerContact;
	}

	
	

}
