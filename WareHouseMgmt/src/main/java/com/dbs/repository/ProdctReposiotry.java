package com.dbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbs.entity.Product;


/**
 * @author Vaibhav
 * Interface to handle Product operations
 * extends : JpaRepository<Product, Integer>
 */
public interface ProdctReposiotry extends JpaRepository<Product, Integer> {

	List<Product> findByProductName(String productName);
	
	
	/**Method : getProductsAsPerDate
	 * @author Vaibhav
	 * get Products As Per Date
	 * returns List<Product>
	 */
	@Query("select new com.dbs.entity.Product(ProductDate,COUNT(ProductID) as ProductPerDay) from Product group by ProductDate")
	List<Product> getProductsAsPerDate();
	
	
	

}
