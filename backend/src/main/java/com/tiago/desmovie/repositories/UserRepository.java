package com.tiago.desmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.desmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
