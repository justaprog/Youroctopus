package com.youroctopus.myapp.controller;

import com.youroctopus.myapp.model.Review;
import com.youroctopus.myapp.repository.ReservationRepository;
import com.youroctopus.myapp.repository.ReviewRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/reviews")
public class ReviewController {
    private final ReviewRepository reviewRepository;

    public ReviewController(ReviewRepository reviewRepository){
        this.reviewRepository =  reviewRepository;
    }
    @GetMapping("")
    List<Review> findAll(){
        return reviewRepository.findAll();
    }
}
