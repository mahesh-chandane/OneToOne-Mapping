package com.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.model.Address;
import com.onetoone.serviceImpl.AdressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	
	@Autowired
	private AdressService adressService; 
	

    @PostMapping("saveAddress")
    public Address saveAddress( @RequestBody Address address)
    {
		return adressService.saveAddress(address);
    	
    }
   
    @GetMapping("getAddress/{id}")
    public Address getTheSingleAddress(@PathVariable int id)
    {
    	Address t= adressService.getAddress(id);
    return t;
    }
}
