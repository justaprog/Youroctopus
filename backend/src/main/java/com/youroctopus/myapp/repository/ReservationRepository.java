package com.youroctopus.myapp.repository;

import com.youroctopus.myapp.model.Reservation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReservationRepository {
    private List<Reservation> reservations = new ArrayList<>();

    public List<Reservation> findAll(){
        return reservations;
    }

    void create(Reservation reservation){
        reservations.add(reservation);
    }
}
