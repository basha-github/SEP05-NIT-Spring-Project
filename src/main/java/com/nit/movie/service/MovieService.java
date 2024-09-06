package com.nit.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.movie.model.Movies;
import com.nit.movie.repo.MovieRepo;

@Service
public class MovieService {
	
	@Autowired
	MovieRepo movieRepo;

	public List<Movies> addNewMovie(List<Movies> movie) {
		
		return movieRepo.saveAll(movie);
	}

	public List<Movies> fetchAllMovies() {
		
		return movieRepo.findAll();
	}

	public Movies updateMovie(Movies movie) {
		Movies dbMovie = null;
		try {
			 dbMovie = movieRepo.findById(movie.getId()).get();
			movieRepo.save(movie);
		}catch(Exception e) {
			dbMovie = new Movies();
		}
		
		return dbMovie;
		
		
		
	}

	public String deleteMovie(int id) {
		Movies dbMovie = null;
		String res = "success";
		try {
			 dbMovie = movieRepo.findById(id).get();
			movieRepo.deleteById(id);
		}catch(Exception e) {
			res = "fail";
		}
		
		return res;
		
	}

	public Movies getMovie(int id) {
		
		return movieRepo.findById(id).get();
		
	}

}
