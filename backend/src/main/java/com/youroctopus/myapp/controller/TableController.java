package com.youroctopus.myapp.controller;

import com.youroctopus.myapp.model.Review;
import com.youroctopus.myapp.model.RestaurantTable;
import com.youroctopus.myapp.repository.TableRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/tables")
public class TableController {
    private final TableRepository tableRepository;

    public TableController(TableRepository tableRepository){
        this.tableRepository = tableRepository;
    }
    @GetMapping("")
    List<RestaurantTable> findAll(){
        return tableRepository.findAll();
    }
}
