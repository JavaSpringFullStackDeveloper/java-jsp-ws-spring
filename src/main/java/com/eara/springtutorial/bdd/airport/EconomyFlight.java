package com.eara.springtutorial.bdd.airport;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EconomyFlight extends Flight {

    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengers.add(passenger);
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return !passenger.isVip() ? passengers.remove(passenger) : false;
    }
}
