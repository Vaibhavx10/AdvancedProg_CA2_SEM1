/**
 * 
 */
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
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "WarehouseUser")
@SuppressWarnings("unused")
public class WarehouseUser {
	@Id
	@GeneratedValue
	/* @Column(name = "WarehouseUserId") */
	private Integer WarehouseUserId;
	
	private String UserName;
	
	private String Password;
	
	private Integer UserRole;
	
	
}
