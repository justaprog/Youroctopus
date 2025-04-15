package com.youroctopus.myapp.controller;

import com.youroctopus.myapp.model.Restaurant;
import com.youroctopus.myapp.repository.RestaurantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    private final RestaurantRepository restaurantRepository;

    public RestaurantController(RestaurantRepository restaurantRepository){
        this.restaurantRepository = restaurantRepository;
    }
    @GetMapping("")
    List<Restaurant> findAll(){
        return restaurantRepository.findAll();
    }
}
