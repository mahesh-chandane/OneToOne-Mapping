package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.model.Laptop;
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

	
}
