package com.dbs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.Product;

public interface ProdctReposiotry extends JpaRepository<Product, Integer> {

	Optional<Product> findByName(String pName);

}
