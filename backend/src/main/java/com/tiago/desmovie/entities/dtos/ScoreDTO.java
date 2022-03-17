package com.tiago.desmovie.entities.dtos;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ScoreDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long movieId;
	private String email;
	private Double score;
}
