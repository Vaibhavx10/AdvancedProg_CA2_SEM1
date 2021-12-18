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

@Service
public class ProdService {

	
	@Autowired
	private ProdctReposiotry prodctReposiotry;
	
	
	@Autowired
	private ShipmentRepo shipmentRepo;
	
	@Autowired
	private ProductCategoryRepo productCategoryRepo;
	
	public void saveStuff(Product product) {
		prodctReposiotry.save(product);
	}
	
	public List<Product> getAllProducts() {
		List<Product> prdlist = prodctReposiotry.findAll(); 
		return prdlist;
	}
	
	public List<ProductCategory> getAllProductCategory() {
		List<ProductCategory> prdlist = productCategoryRepo.findAll(); 
		return prdlist;
	}
	
	
	//Not used as of now
	public List<String> getProductNameAndStorageTypeID() {
		List<String> prdlist = productCategoryRepo.getProductName(); 
		return prdlist;
	}
	
	public List<Product> getAllProductsPerDate() {
		List<Product> prd= prodctReposiotry.getProductsAsPerDate(); 
		return prd;
	}
	
	public Product getStuffByID(int pID) {
		return prodctReposiotry.findById(pID).orElse(null);
	}
	
	public List<Product> getStuffByName(String pName) {
		return prodctReposiotry.findByProductName(pName);
	}
	
	public String deleteStuff(Integer id) {
		 prodctReposiotry.deleteById(id);
		 return "Deleted ID : "+id+"SucessFully !! ";
	}
	
	public Product updateStuff(Product pro) {
		Product prd  = prodctReposiotry.findById(pro.getProductCategoryId()).orElse(null);
		prd.setProductId(1);;
		prd.setProductName("AAA");
		prd.setUnitPrice(879);
		prd.setQuantityPerUnit(657687);
		return prodctReposiotry.save(prd);
		
	}
	
	public List<Shipment> getShipmentDetails() {
		System.out.println("shipmentRepo :: "+shipmentRepo.findAll());
		return shipmentRepo.findAll();
	}
	
	
	
}
