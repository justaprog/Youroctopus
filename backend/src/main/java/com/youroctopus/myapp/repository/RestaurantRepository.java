package com.youroctopus.myapp.repository;

import com.youroctopus.myapp.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepository {
    private List<Restaurant> restaurants = new ArrayList<>();

    public List<Restaurant> findAll(){
        return restaurants;
    }

    void create(Restaurant restaurant){
        restaurants.add(restaurant);
    }
}
