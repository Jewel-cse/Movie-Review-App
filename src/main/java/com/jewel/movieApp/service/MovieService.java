package com.jewel.movieApp.service;

import com.jewel.movieApp.model.Movie;
import com.jewel.movieApp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovie(){
        return movieRepository.findAll();
    }

    public Movie getAsingleMovie(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
