package com.springmvc.cinema.service;

import org.springframework.stereotype.Service;

import com.springmvc.cinema.domain.Movie;

@Service
public class MovieServiceImpl implements MovieService{

	@Override
	public Movie get() {
		Movie dummy = new Movie();
		dummy.setTitle("Interstellar");
		dummy.setDuration("128");
		dummy.setGender("Sci-fi");
		dummy.setRating("PG-13");
		return dummy;
	}

}
