package com.tiago.desmovie.entities.dtos;

import java.io.Serializable;

import com.tiago.desmovie.entities.Movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	public MovieDTO(Movie obj) {
		id = obj.getId();
		title = obj.getTitle();
		score = obj.getScore();
		count = obj.getCount();
		image = obj.getImage();
	}
}
