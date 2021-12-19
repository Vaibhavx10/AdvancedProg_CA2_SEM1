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
 * Entity for Storage
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Storage")
@SuppressWarnings("unused")
public class Storage {
	
	@Id
	@GeneratedValue
	private String StorageId;
	private String StorageTypeId;
	private String StorageGUID;

}
