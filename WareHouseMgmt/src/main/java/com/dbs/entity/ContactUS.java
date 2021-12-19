package com.dbs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "ContactUS")
public class ContactUS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ContactID;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Country;
	private String Phone;
	private String Message;

}
