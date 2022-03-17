package com.tiago.desmovie.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tiago.desmovie.entities.Movie;
import com.tiago.desmovie.entities.Score;
import com.tiago.desmovie.entities.User;
import com.tiago.desmovie.entities.dtos.MovieDTO;
import com.tiago.desmovie.entities.dtos.ScoreDTO;
import com.tiago.desmovie.repositories.MovieRepository;
import com.tiago.desmovie.repositories.ScoreRepository;
import com.tiago.desmovie.repositories.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ScoreService {

	private MovieRepository movieRepository;
	private UserRepository userRepository;
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		if(user == null) {
			user = new User(null, dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);

		double sum = movie.getScores().stream().map(x -> x.getValue()).reduce(0.0, (x, y) -> x + y);

		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}
}
