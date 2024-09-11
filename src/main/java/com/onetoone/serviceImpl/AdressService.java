package com.onetoone.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.onetoone.model.Address;
import com.onetoone.repository.AddressRepository;
@Service
public class AdressService {

	
	@Autowired
	AddressRepository addressRepository;
	
	 public Address saveAddress(Address adress)
    {
		return addressRepository.save(adress);
    	
    }
   
    @GetMapping("get/{id}")
    public Address getAddress( int id)
    {
    	Address t= addressRepository.findById(id).orElse(null);
    return t;
    }
}
