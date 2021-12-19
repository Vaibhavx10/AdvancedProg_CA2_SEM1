package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Product;
import com.dbs.entity.ProductCategory;
import com.dbs.entity.Shipment;
import com.dbs.repository.ProdctReposiotry;
import com.dbs.repository.ProductCategoryRepo;
import com.dbs.repository.ShipmentRepo;

/**
 * @author Vaibhav
 * Service for product operation
 */
@Service
public class ProdService {

	
	@Autowired
	private ProdctReposiotry prodctReposiotry;
	
	
	@Autowired
	private ShipmentRepo shipmentRepo;
	
	@Autowired
	private ProductCategoryRepo productCategoryRepo;
	
	
	/**Method : deleteStuff
	 * @author Vaibhav
	 * delete product
	 * parameters : int
	 * returns : String
	 */
	public void saveStuff(Product product) {
		prodctReposiotry.save(product);
	}
	
	
	/**Method : getAllProducts
	 * @author Vaibhav
	 * getAllProducts
	 * returns : List<Product>
	 */
	public List<Product> getAllProducts() {
		List<Product> prdlist = prodctReposiotry.findAll(); 
		return prdlist;
	}

	/**Method : getAllProductCategory
	 * @author Vaibhav
	 * getAllProductCategory
	 * returns : List<ProductCategory>
	 */
	public List<ProductCategory> getAllProductCategory() {
		List<ProductCategory> prdlist = productCategoryRepo.findAll(); 
		return prdlist;
	}
	
	
	//Not used as of now
	public List<String> getProductNameAndStorageTypeID() {
		List<String> prdlist = productCategoryRepo.getProductName(); 
		return prdlist;
	}
	
	
	/**Method : getAllProductsPerDate
	 * @author Vaibhav
	 * getAllProductsPerDate
	 * returns : List<Product>
	 */
	public List<Product> getAllProductsPerDate() {
		List<Product> prd= prodctReposiotry.getProductsAsPerDate(); 
		return prd;
	}
	
	
	/**Method : getStuffByID
	 * @author Vaibhav
	 * getStuffByID
	 * parameters : int
	 * returns : Product
	 */
	public Product getStuffByID(int pID) {
		return prodctReposiotry.findById(pID).orElse(null);
	}
	
	
	/**Method : getStuffByName
	 * @author Vaibhav
	 * getStuffByName
	 * parameters : String
	 * returns : List<Product>
	 */
	public List<Product> getStuffByName(String pName) {
		return prodctReposiotry.findByProductName(pName);
	}
	
	/**Method : deleteStuff
	 * @author Vaibhav
	 * delete product
	 * parameters : int
	 * returns : String
	 */
	public String deleteStuff(Integer id) {
		 prodctReposiotry.deleteById(id);
		 return "Deleted ID : "+id+"SucessFully !! ";
	}
	
	/**Method : updateStuff
	 * @author Vaibhav
	 * update product
	 * parameters : Product
	 * returns : Product
	 */
	public Product updateStuff(Product pro) {
		Product prd  = prodctReposiotry.findById(pro.getProductCategoryId()).orElse(null);
		prd.setProductId(1);;
		prd.setProductName("AAA");
		prd.setUnitPrice(879);
		prd.setQuantityPerUnit(657687);
		return prodctReposiotry.save(prd);
		
	}
	
	/**Method : getShipmentDetails
	 * @author Vaibhav
	 * Get shipment details
	 * returns : List<Shipment>
	 */
	public List<Shipment> getShipmentDetails() {
		System.out.println("shipmentRepo :: "+shipmentRepo.findAll());
		return shipmentRepo.findAll();
	}
	
	
	
}
