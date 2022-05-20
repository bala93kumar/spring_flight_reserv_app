package com.balakumar.spring_flight_reserv_app.controller;


import com.balakumar.spring_flight_reserv_app.entities.Flight;
import com.balakumar.spring_flight_reserv_app.repos.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FlightController {

    @Autowired
    FlightRepo repo;

    @RequestMapping("/findFlights")
    public String findFlights(@RequestParam("from") String from ,
                              @RequestParam("to") String to ,
                              @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
                              ModelMap modelMap) {

         List<Flight> flights =   repo.findFlights(from , to , departureDate);
         modelMap.addAttribute("flights", flights);
        return "flights/displayFlights";

    }

}
