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
@Table(name = "ShipmentStatus")
public class ShipmentStatus {
	
	@Id
	@GeneratedValue
	private Integer ShipmentStatusId;
	private String ShipmentStatusDescription;
	
}
