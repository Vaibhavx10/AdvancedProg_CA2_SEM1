package com.dbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.Product;

public interface ProdctReposiotry extends JpaRepository<Product, Integer> {

	List<Product> findByProductName(String productName);

}
