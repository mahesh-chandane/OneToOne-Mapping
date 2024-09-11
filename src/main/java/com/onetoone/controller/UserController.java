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
import com.onetoone.repository.UserRepository;
import com.onetoone.serviceImpl.UserService;
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private UserRepository repository;
	
    @PostMapping("save")
    public Users saveUserData(@RequestBody Users user)
    {
		return service.saveUser(user);
    }
   
    @GetMapping("get/{id}")
    public Users getTheSingleUser(@PathVariable int id)
    {
    	return service.getUser(id);
       
    }
    
    @PutMapping("updateLaptop")
	public Users updateUsers(@RequestBody Users user) {
		return service.updateUsers(user);
	}

	@GetMapping("getLaptop/{id}")
	public Users getTheSingleLaptop(@PathVariable int id) {
		return service.getUsers(id);
	}

	@GetMapping("getLaptop/{id}")
	public Users deleteUsers(@PathVariable int id) {
		return service.deleteUsers(id);

	}

	@GetMapping("getAll")
	public List<Users> getAllUsers() {
		return repository.findAll();

	}
    
  
}
