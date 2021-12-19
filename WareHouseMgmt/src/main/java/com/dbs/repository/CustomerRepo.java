package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.Customer;

/**
 * @author Vaibhav
 * Repository for customer operations
 * extends : JpaRepository<Customer, Integer>
 */
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
