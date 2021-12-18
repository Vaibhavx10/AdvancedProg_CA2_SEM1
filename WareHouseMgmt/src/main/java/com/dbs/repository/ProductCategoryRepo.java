package com.dbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbs.entity.ProductCategory;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Integer>{

	
	@Query(value="select ProductCategoryName from ProductCategory",nativeQuery = true)
	List<String> getProductName();
}
