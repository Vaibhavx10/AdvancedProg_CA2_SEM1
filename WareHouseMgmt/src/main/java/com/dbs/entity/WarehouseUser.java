/**
 * 
 */
package com.dbs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pankesh
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "WarehouseUser")
@SuppressWarnings("unused")
public class WarehouseUser {
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	@Column(name = "WarehouseUserId")
	private Integer id;
	
	private String UserName;
	
	private String Password;
	
	private Integer UserRole;


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

	/**
	 * @return the userRole
	 */
	public Integer getUserRole() {
		return UserRole;
	}

	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(Integer userRole) {
		UserRole = userRole;
	}

	@Override
	public String toString() {
		return "WarehouseUser [id=" + id + ", UserName=" + UserName + ", Password=" + Password + ", UserRole="
				+ UserRole + "]";
	}

	
}
