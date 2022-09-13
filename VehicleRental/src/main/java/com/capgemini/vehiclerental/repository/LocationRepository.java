package com.capgemini.vehiclerental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.vehiclerental.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer>{

}
