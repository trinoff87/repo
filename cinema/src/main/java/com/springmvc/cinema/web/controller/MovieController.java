package com.springmvc.cinema.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.cinema.domain.Movie;
import com.springmvc.cinema.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="/movie", method = RequestMethod.GET)
	public @ResponseBody Movie printMovie(){
		return movieService.get();
	}

}
