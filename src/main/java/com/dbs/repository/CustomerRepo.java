package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
