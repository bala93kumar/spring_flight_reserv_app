package com.balakumar.spring_flight_reserv_app.services;

import com.balakumar.spring_flight_reserv_app.dto.ReservationRequest;
import com.balakumar.spring_flight_reserv_app.entities.Reservation;

public interface ReservationService {

    public Reservation bookFlight(ReservationRequest request);
}
