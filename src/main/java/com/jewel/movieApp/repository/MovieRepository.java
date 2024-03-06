package com.jewel.movieApp.repository;

import com.jewel.movieApp.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Movie findByImdbId(String imdbId);
}
