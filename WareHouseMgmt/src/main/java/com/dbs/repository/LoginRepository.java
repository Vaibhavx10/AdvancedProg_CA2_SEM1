/**
 * 
 */
package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.WarehouseUser;

/**
 * @author Pankesh
 *
 */
public interface LoginRepository extends JpaRepository<WarehouseUser, Integer> {

}
