package com.qa.business.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.qa.persistence.domain.Movie;
import com.qa.util.JSONUtil;



@Alternative
@ApplicationScoped
public class MovieMapRepository implements IMovieRepository {
	
	private final Long INITIAL_ID = 1L;
	private Map<Long, Movie> movieMap;
	private Long ID;
	
	@Inject
	private JSONUtil util;
	
	private void initMovieMap() {
		Movie movie = new Movie ("Harry Pothead", "Wizardry", "18");
		movieMap.put(1L, movie);
	}
	
	private void movieMapRepositoryStart() {
		this.movieMap = new HashMap<Long, Movie>();
		ID = INITIAL_ID;
		initMovieMap();
	}
	
	
	
	

	@Override
	public String getAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAMovie(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createMovie(String movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteMovie(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateMovie(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
