package com.onetoone.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.model.Address;
@Repository
public interface AddressRepository  extends JpaRepository< Address, Integer>{

}
