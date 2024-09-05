package com.nit.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.movie.model.Movies;
import com.nit.movie.service.MovieService;

@RestController
public class MoviesController {

	@Autowired
	MovieService movieService;
	
	
	@PostMapping("/nit/movies/add")
	public List<Movies> createNewMovie(@RequestBody List<Movies> movie) {
		return movieService.addNewMovie(movie);
	}
	
	@GetMapping("/nit/movies/all")
	public List<Movies> getAll() {
		return movieService.fetchAllMovies();
		
	}
	
	@PutMapping("/nit/movies/update")
	public Movies updateMovie(@RequestBody Movies movie) {
		return movieService.updateMovie(movie);
	}
	
	
	@DeleteMapping("/nit/movies/delete")
	public String updateMovie(@RequestParam int id) {
		return movieService.deleteMovie(id);
	}
	
	 
	
	
}
