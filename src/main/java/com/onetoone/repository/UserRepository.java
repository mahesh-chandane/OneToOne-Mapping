package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.model.Users;
@Repository
public interface UserRepository extends JpaRepository< Users, Integer> {

}
