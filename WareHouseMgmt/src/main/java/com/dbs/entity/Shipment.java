package com.dbs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Shipment")
@Setter
@Getter
public class Shipment {
	
	@Id
	@GeneratedValue
	private Integer ShipmentId;
	private String ShipmentDate;
	
	
	@Column(name="ShipmentAddress")
	private String ShipmentAddress;
	
	
	//Getting the info using inner join
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ShipmentStatusId")
	private ShipmentStatus shipmentStatus;

	//Getting the info using inner join
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OrderId")
	private Order order;

}
