package com.dbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbs.entity.ProductCategory;




/**
 * @author Vaibhav
 * Interface to handle ProductCategory operations
 * extends : JpaRepository<ProductCategory, Integer>
 */
public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Integer>{

	/**Method : getProductName
	 * @author Vaibhav
	 * get Product Name
	 * returns List<String>
	 */
	@Query(value="select ProductCategoryName from ProductCategory",nativeQuery = true)
	List<String> getProductName();
}
