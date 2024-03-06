package com.jewel.movieApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class Review {
    private ObjectId id;
    private String reviewBody;

    public Review(String reviewBody) {
        this.reviewBody = reviewBody;
    }
}
