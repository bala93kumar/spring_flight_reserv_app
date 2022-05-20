package com.balakumar.spring_flight_reserv_app.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Entity(name="FLIGHT")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "FLIGHT_NUMBER")
    private String flightNumber;
    @Column(name = "OPERATING_AIRLINES")
    private String operatingAirlines;

    @Column(name="DEPARTURE_CITY")
    private String departureCity;

    @Column(name="ARRIVAL_CITY")
    private String arrivalCity;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_DEPARTURE")
    private Date dateOfDeparture;

    @Column(name="ESTIMATED_DEPARTURE_TIME")
    private Timestamp estimatedDeparture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Timestamp getEstimatedDeparture() {
        return estimatedDeparture;
    }

    public void setEstimatedDeparture(Timestamp estimatedDeparture) {
        this.estimatedDeparture = estimatedDeparture;
    }
}
