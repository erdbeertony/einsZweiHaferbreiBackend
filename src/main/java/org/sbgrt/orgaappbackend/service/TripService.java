package org.sbgrt.orgaappbackend.service;

import org.sbgrt.orgaappbackend.model.Trip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    public List<Trip> getAllTrips() {
        Trip t1 = new Trip();
        t1.setName("Bungee-Jumping");
        t1.setDescription("Ein unvergessliches Event mit Nervenkitzel");

        Trip t2 = new Trip();
        t2.setName("Protest in China mitmachen");
        t2.setDescription("Tauchen Sie ein in eine Abenteuerwelt ohne Rückkehrgarantie");

        return List.of(t1, t2);
    }
}
