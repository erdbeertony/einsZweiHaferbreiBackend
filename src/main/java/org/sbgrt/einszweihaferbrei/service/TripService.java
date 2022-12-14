package org.sbgrt.einszweihaferbrei.service;

import org.sbgrt.einszweihaferbrei.model.Trip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    public List<Trip> getAllTrips() {
        Trip t1 = new Trip(
                "Bungee-Jumping",
                "Ein unvergessliches Event mit Nervenkitzel",
                "https://www.urlaubstracker.de/wp-content/uploads/2017/07/bungee-jump-ausblick.jpg"
        );

        Trip t2 = new Trip(
                "Protest in China mitmachen",
                "Tauchen Sie ein in eine Abenteuerwelt ohne Rückkehrgarantie",
                "https://media1.faz.net/ppmedia/aktuell/feuilleton/1220981924/1.8493717/format_top1_breit/demonstranten-in-peking.jpg"
        );

        Trip t3  =new Trip(
                "",
                "",
                ""
        );

        Trip t4  =new Trip(
                "",
                "",
                ""
        );

        return List.of(t1, t2);
    }
}
