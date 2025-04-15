package com.youroctopus.myapp.repository;

import com.youroctopus.myapp.model.Reservation;
import com.youroctopus.myapp.model.RestaurantTable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TableRepository {
    private List<RestaurantTable> tables = new ArrayList<>();

    public List<RestaurantTable> findAll(){
        return tables;
    }

    void create(RestaurantTable table){
        tables.add(table);
    }
}
