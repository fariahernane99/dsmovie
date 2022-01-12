package com.hernane.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hernane.dsmovie.entities.Score;
import com.hernane.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
