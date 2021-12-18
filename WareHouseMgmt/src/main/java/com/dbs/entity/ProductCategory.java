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
@Table(name = "ProductCategory")
public class ProductCategory {
	
	@Id
	@GeneratedValue
	private Integer ProductCategoryId;
	private String ProductCategoryName;
	private String CategoryDescription;
	

}
