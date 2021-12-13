/**
 * 
 */
package com.dbs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pankesh
 *
 */

@NamedStoredProcedureQuery(
		  name="GetStoragesByType",
		  procedureName="WHM_GetAllStorageByType",
		  resultClasses = { StorageDetail.class }
		)
		@Entity
		@Data
		@AllArgsConstructor
		@NoArgsConstructor
		@SuppressWarnings("unused")
public class StorageDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer StorageId;
	
	private Integer StorageTypeId;	
	private String StorageGUID;
	private Integer ProductQuantity;
	private Integer Capacity;
}
 