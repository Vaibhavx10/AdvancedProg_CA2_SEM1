package com.dbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbs.entity.Product;

public interface ProdctReposiotry extends JpaRepository<Product, Integer> {

	List<Product> findByProductName(String productName);
	
	@Query("select new com.dbs.entity.Product(ProductDate,COUNT(ProductID) as ProductPerDay) from Product group by ProductDate")
	List<Product> getProductsAsPerDate();
	
	@Query(value="select ProductName from Product",nativeQuery = true)
	List<String> getProductNameAndStorageTypeID();
	

}
