package com.balakumar.spring_flight_reserv_app.controller;


import com.balakumar.spring_flight_reserv_app.dto.ReserVationUpdateRequest;
import com.balakumar.spring_flight_reserv_app.entities.Reservation;
import com.balakumar.spring_flight_reserv_app.repos.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ReservationRestController {

    @Autowired
    ReservationRepo resevrRepo;

    @RequestMapping("/findReservation/{id}" )
    public Reservation findReservation(@PathVariable("id") int id) {

        Reservation reserv =  resevrRepo.getOne(id);

        return reserv;
    }

    @RequestMapping("/findReservation")
    public Reservation updateReservation(@RequestBody ReserVationUpdateRequest request) {

        Reservation  reserv =  resevrRepo.getById(request.getId());

        reserv.setNoOfBags(request.getNoOfBags());
        reserv.setCheckedIn(request.getCheckedIn());

        resevrRepo.save(reserv);

        return  reserv;


    }

}
