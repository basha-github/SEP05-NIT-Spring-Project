package com.nit.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.movie.model.Movies;

public interface MovieRepo  extends JpaRepository<Movies, Integer>{

}
