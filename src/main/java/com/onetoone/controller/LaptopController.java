package com.onetoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.model.Laptop;
import com.onetoone.model.Users;
import com.onetoone.repository.LaptopRepository;
import com.onetoone.serviceImpl.LaptopService;
import com.onetoone.serviceImpl.UserService;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

	@Autowired
	private LaptopService service;

	@Autowired
	private LaptopRepository laptopRepository;

	@PostMapping("saveLaptop")
	public Laptop saveLaptop(@RequestBody Laptop laptop) {
		return service.saveLaptop(laptop);
	}

	@PutMapping("updateLaptop")
	public Laptop updateLaptop(@RequestBody Laptop laptop) {
		return service.updateLaptop(laptop);
	}

	@GetMapping("getLaptop/{id}")
	public Laptop getTheSingleLaptop(@PathVariable int id) {
		return service.getLaptop(id);
	}

	@GetMapping("getLaptop/{id}")
	public Laptop deleteLaptop(@PathVariable int id) {
		return service.deleteLaptop(id);

	}

	@GetMapping("getAll")
	public List<Laptop> getAllLaptop() {
		return laptopRepository.findAll();

	}

}
