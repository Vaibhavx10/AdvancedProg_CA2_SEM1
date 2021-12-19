package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.ContactUS;


/**
 * @author Chirag
 * Repository for ContactUS operations
 * extends : JpaRepository<ContactUS, Integer>
 */
public interface ContactUSRepo extends JpaRepository<ContactUS, Integer>{

}
