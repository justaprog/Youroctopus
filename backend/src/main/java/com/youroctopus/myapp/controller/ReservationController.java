package com.youroctopus.myapp.controller;

import com.youroctopus.myapp.model.Reservation;
import com.youroctopus.myapp.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    private final ReservationRepository reservationRepository;

    public ReservationController(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }
    @GetMapping("")
    List<Reservation> findAll() {
        return reservationRepository.findAll();
    }
}
