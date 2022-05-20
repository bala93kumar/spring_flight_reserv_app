package com.balakumar.spring_flight_reserv_app.repos;

import com.balakumar.spring_flight_reserv_app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
