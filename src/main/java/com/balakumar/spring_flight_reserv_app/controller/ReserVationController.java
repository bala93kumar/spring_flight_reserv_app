package com.balakumar.spring_flight_reserv_app.controller;


import com.balakumar.spring_flight_reserv_app.dto.ReservationRequest;
import com.balakumar.spring_flight_reserv_app.entities.Flight;
import com.balakumar.spring_flight_reserv_app.entities.Reservation;
import com.balakumar.spring_flight_reserv_app.repos.FlightRepo;
import com.balakumar.spring_flight_reserv_app.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ReserVationController {

    @Autowired
    FlightRepo repo;

    @Autowired
    ReservationService  reservationService;

    @RequestMapping("/showCompleteReservation")
    public String  showCompleteReservation(@RequestParam("flightId") int flightid, ModelMap modelMap) {


       Flight  flight = repo.getById(flightid);

       modelMap.addAttribute("flight" , flight);

        return "flights/completeReservation";
    }

    @RequestMapping(value = "/completeReservation", method = RequestMethod.POST)
    public String completeReservation(ReservationRequest request, ModelMap modelMap) {

        Reservation reservation = reservationService.bookFlight(request);
        modelMap.addAttribute("msg" ,"Rservation created successfully and id is " +
                reservation.getId());


        return "flights/reservationConfirmation";
    }


}
