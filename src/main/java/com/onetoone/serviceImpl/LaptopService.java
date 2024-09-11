package com.onetoone.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoone.model.Laptop;

import com.onetoone.repository.LaptopRepository;


@Service
public class LaptopService {

	@Autowired
	private LaptopRepository laptopRepository;

	public Laptop saveLaptop(Laptop lap) {
		return laptopRepository.save(lap);

	}

	public Laptop updateLaptop(Laptop lap) {

		Laptop laptop = laptopRepository.findById(lap.getLaptop_id()).get();
		laptop.setBrand(lap.getBrand());
		laptop.setModel(lap.getModel());
		return laptopRepository.save(laptop);

	}

	public Laptop getLaptop(int id) {
		return laptopRepository.findById(id).orElse(null);

	}

	public Laptop deleteLaptop(int id) {
		return laptopRepository.findById(id).orElse(null);

	}

}
