package com.balakumar.spring_flight_reserv_app.services;

import com.balakumar.spring_flight_reserv_app.dto.ReservationRequest;
import com.balakumar.spring_flight_reserv_app.entities.Flight;
import com.balakumar.spring_flight_reserv_app.entities.Passenger;
import com.balakumar.spring_flight_reserv_app.entities.Reservation;
import com.balakumar.spring_flight_reserv_app.repos.FlightRepo;
import com.balakumar.spring_flight_reserv_app.repos.PassengerRepo;
import com.balakumar.spring_flight_reserv_app.repos.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserVationServicesImpl  implements   ReservationService{

    @Autowired
    PassengerRepo passRepo;

    @Autowired
    FlightRepo flightRepo;

    @Autowired
    ReservationRepo reservRepo;

    @Override
    public Reservation bookFlight(ReservationRequest request) {

        int flightId =  request.getFlightId();

        Flight flight = flightRepo.getById(flightId);

        Passenger passenger = new Passenger();
        passenger.setFirst_name(request.getPassengerFirstName());
        passenger.setEmail(request.getPassengerEmail());
        passenger.setPhone(request.getPassengerPhone());
        Passenger savedPass =  passRepo.save(passenger);

        Reservation reservObj =  new Reservation();
        reservObj.setFlight(flight);
        reservObj.setPassenger(savedPass);
        reservObj.setCheckedIn(false);

        Reservation savedReserv =  reservRepo.save(reservObj);

        return savedReserv;
    }
}
