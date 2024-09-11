package com.onetoone.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.onetoone.model.Users;

import com.onetoone.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public Users saveUser(Users user) {
		return repository.save(user);

	}

	public Users getUser(int id) {
		return repository.findById(id).orElse(null);
		
	}
	
	public Users updateUsers(Users user1) {

		Users user = repository.findById(user1.getUser_id()).get();
		user.setUser_name(user1.getUser_name());
		user.setUser_mobile(user1.getUser_mobile());
		user.setAddress(user1.getAddress());
		return repository.save(user);

	}

	public Users getUsers(int id) {
		return repository.findById(id).orElse(null);

	}

	public Users deleteUsers(int id) {
		return repository.findById(id).orElse(null);

	}



}
