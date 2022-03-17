package com.tiago.desmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.desmovie.entities.Score;
import com.tiago.desmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
