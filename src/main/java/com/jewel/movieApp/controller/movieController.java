package com.jewel.movieApp.controller;

import com.jewel.movieApp.model.Movie;
import com.jewel.movieApp.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class movieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/api/v1/movies")
    public ResponseEntity<List<Movie>> retrieveAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.getAllMovie(), HttpStatus.OK);
    }

    @GetMapping("/api/v1/{id}")
    public ResponseEntity<Movie> retrieveMovieById(@PathVariable ObjectId id){
        return new ResponseEntity<Movie>(movieService.getMovieById(id), HttpStatus.OK);
    }
}
