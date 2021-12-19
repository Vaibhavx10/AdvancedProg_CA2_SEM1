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
	private String ContactDate;

	public ContactUS(String firstName, String lastName, String email, String country, String phone, String message,
			String contactdate) {
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Country = country;
		Phone = phone;
		Message = message;
		ContactDate = contactdate;
	}

	public Integer getContactID() {
		return ContactID;
	}

	public void setContactID(Integer contactID) {
		ContactID = contactID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getContactDate() {
		return ContactDate;
	}

	public void setContactDate(String contactDate) {
		ContactDate = contactDate;
	}

	@Override
	public String toString() {
		return "ContactUS [ContactID=" + ContactID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email="
				+ Email + ", Country=" + Country + ", Phone=" + Phone + ", Message=" + Message + ", ContactDate="
				+ ContactDate + "]";
	}

}
