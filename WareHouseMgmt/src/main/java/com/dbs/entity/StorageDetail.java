/**
 * 
 */
package com.dbs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pankesh
 *
 */

@NamedStoredProcedureQuery(
		  name="GetStorageByType",
		  procedureName="WHM_GetAllStorageByType",
		  resultClasses = { StorageDetail.class },
		  parameters={
		            @StoredProcedureParameter(name="p_StorageTypeId", type=String.class, mode=ParameterMode.IN)
		        }
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
 