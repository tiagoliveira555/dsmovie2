package com.tiago.desmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tiago.desmovie.entities.Movie;
import com.tiago.desmovie.entities.dtos.MovieDTO;
import com.tiago.desmovie.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Movie> obj = repository.findAll(pageable);
		return obj.map(x -> new MovieDTO(x));
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Movie obj = repository.findById(id).get();
		return new MovieDTO(obj);
	}
}
