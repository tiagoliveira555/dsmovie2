package com.tiago.desmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.desmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
