package com.capgemini.vehiclerental.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.vehiclerental.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer > {

	

}
