package com.authen.jwt.authentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authen.jwt.authentication.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
    
    Optional<User> findByUsername(String username);
}
