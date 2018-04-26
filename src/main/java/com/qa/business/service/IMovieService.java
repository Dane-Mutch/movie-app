package com.qa.business.service;

public interface IMovieService {
	
	String getAllMovies();
	
	String getAMovie(Long id);
	
	String createMovie(String movieJSON);
	
	String deleteMovie(Long id);
	
	String updateMovie(Long id);

}
