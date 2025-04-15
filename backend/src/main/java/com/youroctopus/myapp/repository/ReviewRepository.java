package com.youroctopus.myapp.repository;

import com.youroctopus.myapp.model.Review;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReviewRepository {
    private List<Review> reviews = new ArrayList<>();

    public List<Review> findAll(){
        return reviews;
    }
    void create(Review review){
        reviews.add(review);
    }
}
