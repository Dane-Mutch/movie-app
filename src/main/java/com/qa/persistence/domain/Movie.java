package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Movie {
	
	
	@Id
	private Long id;
	@Column(length=100)
	private String title; 
	@Column(length=30)
	private String genre;
	@Column(length=5)
	private String rating;
	
	
	
	public Movie() {
	}
	
	public Movie(String title, String genre, String rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	
}
