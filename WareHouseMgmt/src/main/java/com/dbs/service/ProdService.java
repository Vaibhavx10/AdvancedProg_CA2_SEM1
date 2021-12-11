package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Product;
import com.dbs.repository.ProdctReposiotry;

@Service
public class ProdService {

	
	@Autowired
	private ProdctReposiotry prodctReposiotry;
	
	
	public Product saveStuff(Product product) {
		return prodctReposiotry.save(product);
	}
	
	public Product getStuffByID(int pID) {
		return prodctReposiotry.findById(pID).orElse(null);
	}
	
	public Product getStuffByName(String pName) {
		return prodctReposiotry.findByName(pName).orElse(null);
	}
	
	public String deleteStuff(Integer id) {
		 prodctReposiotry.deleteById(id);
		 return "Deleted ID : "+id+"SucessFully !! ";
	}
	
	public Product updateStuff(Product pro) {
		Product prd  = prodctReposiotry.findById(pro.getId()).orElse(null);
		prd.setId(7);
		prd.setName("AAA");;
		prd.setPrice("879");;
		prd.setQuant("657687");
		return prodctReposiotry.save(prd);
		
	}
	
}
