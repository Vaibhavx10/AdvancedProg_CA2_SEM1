/**
 * 
 */
package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dbs.entity.*;

/**
 * @author Pankesh
 * Order Interface, to handle Order related operations
 * extends : JpaRepository<Order, Integer>
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

	/**Method : addOrder
	 * @author Pankesh
	 * add  Order details
	 * parameters : int, String
	 */
	@Procedure(procedureName = "WHM_PlaceOrder")
	void addOrder(@Param("@p_CustomerId") int CustomerId,@Param("@p_PurchaseDetails") String PurchaseDetails);
}
