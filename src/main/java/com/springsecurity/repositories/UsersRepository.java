package com.springsecurity.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.model.User;

import java.util.Optional;

import javax.transaction.Transactional;

@Transactional
public interface UsersRepository extends JpaRepository<User, Integer> {
    Optional<User> findByFirstName(String firstname);
    
    
}
