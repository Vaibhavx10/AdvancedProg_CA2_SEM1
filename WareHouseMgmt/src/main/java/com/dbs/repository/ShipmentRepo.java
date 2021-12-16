package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.Shipment;

public interface ShipmentRepo extends JpaRepository<Shipment, Integer>{

}
