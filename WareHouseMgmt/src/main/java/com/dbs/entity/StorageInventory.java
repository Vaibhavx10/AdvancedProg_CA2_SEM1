/**
 * 
 */
package com.dbs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pankesh
 * Entity for StorageInventory
 */

@NamedStoredProcedureQuery(name = "GetStorageInventory", procedureName = "WHM_GetStorageInventory", resultClasses = {
		StorageInventory.class }, parameters = {
				@StoredProcedureParameter(name = "p_StorageId", type = String.class, mode = ParameterMode.IN) })
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("unused")
public class StorageInventory implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer ProductId;
	private String ProductName;
	private Integer ProductCategoryId;
	private String ProductCategoryName;
	private String CategoryDescription;
	private Integer Quanitiy;
	
}

