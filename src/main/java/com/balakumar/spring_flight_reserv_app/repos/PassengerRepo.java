package com.balakumar.spring_flight_reserv_app.repos;

import com.balakumar.spring_flight_reserv_app.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger, Integer> {
}
