package com.jewel.movieApp.controller;

import com.jewel.movieApp.model.Review;
import com.jewel.movieApp.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class reviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/api/v1/reviews")
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String>payload){
        return new ResponseEntity<Review>
                (reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")),HttpStatus.OK);
    }

}
