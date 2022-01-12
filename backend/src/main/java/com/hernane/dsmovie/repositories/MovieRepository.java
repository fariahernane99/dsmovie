package com.hernane.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hernane.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
