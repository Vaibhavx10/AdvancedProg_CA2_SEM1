package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.Shipment;

/**
 * @author Vaibhav
 * Interface to handle Shipment operations
 * extends : JpaRepository<Shipment, Integer>
 */
public interface ShipmentRepo extends JpaRepository<Shipment, Integer>{

}
