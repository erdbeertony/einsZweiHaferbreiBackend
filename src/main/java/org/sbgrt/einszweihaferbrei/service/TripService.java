package org.sbgrt.einszweihaferbrei.service;

import org.sbgrt.einszweihaferbrei.model.Trip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    public List<Trip> getAllTrips() {
        Trip t1 = new Trip();
        t1.setName("Bungee-Jumping");
        t1.setDescription("Ein unvergessliches Event mit Nervenkitzel");
        t1.setUrl("https://www.urlaubstracker.de/wp-content/uploads/2017/07/bungee-jump-ausblick.jpg");

        Trip t2 = new Trip();
        t2.setName("Protest in China mitmachen");
        t2.setDescription("Tauchen Sie ein in eine Abenteuerwelt ohne Rückkehrgarantie");
        t2.setUrl("https://media1.faz.net/ppmedia/aktuell/feuilleton/1220981924/1.8493717/format_top1_breit/demonstranten-in-peking.jpg");

        return List.of(t1, t2);
    }
}
