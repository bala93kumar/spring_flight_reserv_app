package com.balakumar.spring_flight_reserv_app.repos;

import com.balakumar.spring_flight_reserv_app.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation, Integer> {
}
